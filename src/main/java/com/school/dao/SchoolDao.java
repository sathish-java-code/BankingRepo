package com.school.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.school.entity.SchoolEntity;

@Component
public interface SchoolDao extends CrudRepository<SchoolEntity, Integer> {

}

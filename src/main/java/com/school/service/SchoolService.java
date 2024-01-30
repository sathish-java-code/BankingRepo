package com.school.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.SchoolDao;
import com.school.entity.SchoolEntity;

@Service
public class SchoolService {

	@Autowired
	private SchoolDao schoolDao;

	public SchoolEntity create(SchoolEntity entity) {
		return schoolDao.save(entity);
	}

	public Optional<SchoolEntity> read(Integer id) {
		return schoolDao.findById(id);
	}

	public Iterable<SchoolEntity> readAll() {
		return schoolDao.findAll();
	}
}
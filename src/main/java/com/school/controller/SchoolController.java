package com.school.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.SchoolEntity;
import com.school.service.SchoolService;

@RestController
@RequestMapping(value = "/test")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;

	@PostMapping(value = "/create")
	public SchoolEntity create(@RequestBody SchoolEntity entity) {
		return schoolService.create(entity);
	}

	@GetMapping(value = "/read/{id}")
	public Optional<SchoolEntity> read(@PathVariable("id") Integer id) {
		return schoolService.read(id);
	}

	@GetMapping(value = "/readall")
	public Iterable<SchoolEntity> readAll() {
		return schoolService.readAll();
	}
}

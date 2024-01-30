package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({ "com.school.dao" })
public class SchoolManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManageApplication.class, args);
	}

}

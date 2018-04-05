package com.learning.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.dto.StudentDTO;
import com.learning.form.StudentForm;
import com.learning.service.StudentService;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.learning.service.impl", "com.learning.dao"})
@MapperScan(value = "com.learning.dao")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/test")
	public StudentDTO select(StudentForm form) {
		StudentDTO dto = studentService.selectByPrimaryKey(form.getId());
//		StudentDTO dto = new StudentDTO();
//		dto.setRoleName("test");
		return dto;
	}
}

package com.learning.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.dao.StudentDAO;
import com.learning.dto.StudentDTO;
import com.learning.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public StudentDTO selectByPrimaryKey(int id) {
		return studentDAO.selectByPrimaryKey(id);
	}

}

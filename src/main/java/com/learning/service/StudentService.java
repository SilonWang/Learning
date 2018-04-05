package com.learning.service;

import com.learning.dto.StudentDTO;

public interface StudentService {
	
	public StudentDTO selectByPrimaryKey(int id);

}

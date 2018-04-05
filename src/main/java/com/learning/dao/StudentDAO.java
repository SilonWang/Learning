package com.learning.dao;

import com.learning.dto.StudentDTO;

public interface StudentDAO {
	
	public StudentDTO selectByPrimaryKey(int id);

}

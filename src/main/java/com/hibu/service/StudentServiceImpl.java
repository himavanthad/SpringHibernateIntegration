package com.hibu.service;

import com.hibu.dao.StudentDao;
import com.hibu.model.Student;

public class StudentServiceImpl implements StudentService {
	
	StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void saveStudent(Student student) throws Exception {
		studentDao.save(student);
	}
}

package com.hibu.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibu.model.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	public void save(Student student) throws Exception {
			getSession().save(student);
			/*throw new Exception();*/
	}
}

package com.hibu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibu.model.Student;
import com.hibu.service.StudentService;

public class AppTest {
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		StudentService service = (StudentService) context.getBean("studentServiceProxy");
		Student student = new Student();
		student.setStudentName("abc");
		service.saveStudent(student);
	}

}

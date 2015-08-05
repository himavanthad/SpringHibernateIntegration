package com.hibu.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hibu.model.Student;
import com.hibu.service.StudentService;

public class StudentController implements Controller {

	StudentService studentService = null;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = null;
		String studentName = request.getParameter("studentName");
		System.out.println("Name:" + studentName);
		System.out.println("Name:" + studentName);
		System.out.println("Name:" + studentName);
		Student student = new Student();
		student.setStudentName(studentName);
		try{
		studentService.saveStudent(student);
		modelAndView = new ModelAndView("success");
		}catch(Exception e){
			System.out.println("*********************************************");
			modelAndView = new ModelAndView("success");
		}
		
		return modelAndView;
	}

}

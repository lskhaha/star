package com.example.star.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.star.dao.StudentMapper;
import com.example.star.model.Student;

@RestController
@ResponseBody
@RequestMapping("/test")
public class TestController {

	@Autowired
	private StudentMapper studentDao;

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public String a() {
		Student student = studentDao.findStudentByUsername("lim");
		System.out.println(student.getAge());
		System.out.println(student.getName());
		return "hello world";
	}
}

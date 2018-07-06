package com.example.star.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.star.dao.StudentMapper;
import com.example.star.model.Student;

//@RunWith(JUnit4.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class testAA {

	@Autowired
	protected RedisTemplate<String, Object> redisTemplate;

	@Resource
	private ValueOperations<String, Object> valueOperations;

	@Autowired
	private StudentMapper studentDao;
	
	@Test
	public void testLombok() {
		Student s = new Student();
		s.setName("as");
		s.setId(12);
		s.setAge(23);
		System.out.println(s.getName());
	}

	@Test
	public void testRedis() {
		Student s = new Student();
		s.setName("lim");
		s.setId(12);
		s.setAge(23);
		valueOperations.set("age", s);
	}

	@Test
	public void testGetVlue() {
		Student s = (Student) valueOperations.get("age");
		System.out.println("姓名:" + s.getName() + ",年龄：" + s.getAge());
	}
	
	@Test
	public void testMybatis(){
		Student s = studentDao.findStudentByUsername("lim");
		System.out.println("name::"+s.getName()+",age:"+s.getAge());
	}
}

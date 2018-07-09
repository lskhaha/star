package com.example.star.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.star.config.rabbitmq.HelloSender;
import com.example.star.model.Student;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {

	@Autowired
	private HelloSender helloSender;

	@Test
	public void testRabbit() {
		// 1、发送普通字符串
		helloSender.send();
		// 2、发送对象
		Student student = new Student();
		student.setName("小林");
		student.setAge(28);
		helloSender.sendStudent(student);

	}

}

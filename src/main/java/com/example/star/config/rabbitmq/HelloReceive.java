package com.example.star.config.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.star.model.Student;

@Component
public class HelloReceive {

	@RabbitListener(queues = "queue")
	public void processC(String str) {
		System.out.println("receive:" + str);
	}

	@RabbitListener(queues = "queue")
	public void processS(Student student) {
		System.out.println("我是一个学生，我名字叫：" + student.getName() 
		+ ",今年" + student.getAge() + "岁。");
	}
}

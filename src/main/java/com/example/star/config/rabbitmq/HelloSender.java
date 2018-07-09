package com.example.star.config.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.star.model.Student;

@Component
public class HelloSender {

	@Autowired
	private AmqpTemplate template;

	public void send() {
		template.convertAndSend("queue", "hello,rebbit..");
	}

	public void sendStudent(Student s) {
		template.convertAndSend("queue", s);
	}
}

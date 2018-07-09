package com.example.star.config.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConf {

	public Queue queue() {
		return new Queue("queue");
	}
}

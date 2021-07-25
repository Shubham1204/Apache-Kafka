package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics="chat",groupId = "test1")
	public void ConsumeFromTopic(String message) {
		System.out.println("From consumer : "+message);
	}
}

package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public String publish(String topic, String message) {
		System.out.println("fromm producer : "+message);
		kafkaTemplate.send(topic,message);
		return "message sent";
	}
}

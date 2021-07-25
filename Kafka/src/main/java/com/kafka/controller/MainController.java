package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.ProducerService;

@RestController
public class MainController {

	@Autowired
	private ProducerService producerService;
	
	@PostMapping("/message")
	public ResponseEntity<?> publishMessage(@RequestParam("msg") String message){
		return ResponseEntity.ok(producerService.publish("chat", message));
	}
}

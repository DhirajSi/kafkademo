package com.example.kafkademo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllermain {

	private static final String Topic = "myfirsttopic";
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping("/test")
	public String getData() {
		doPublish(Topic, "This Is my Third Message");
		return "Successfully response";
	}

	public String doPublish(String topic, String message) {

		kafkaTemplate.send(topic, message);
		return "Successfully message";
	}
	
	

}

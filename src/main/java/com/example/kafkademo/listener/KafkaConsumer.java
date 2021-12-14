package com.example.kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	public void show() {
		System.out.println(7+9);
		System.out.println("HAhahahahah");
	}
	
	@KafkaListener(topics="myfirsttopic", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumer Message &&&&&&&&&&&&&&&&& :"+message);
		
		show();
	}

}

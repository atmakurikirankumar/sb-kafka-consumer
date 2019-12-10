package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SbKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbKafkaConsumerApplication.class, args);
	}
	
	@KafkaListener(topics = {"AKK_SAMPLE_TOPIC"}, groupId = "AKK_SAMPLE_GROUP")
	public void consumeKafkaMessage(String message) {
		System.out.println("==== Consuming the message: ==== "+ message);
	}

}

package com.pault.kafkademo;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@Log
public class KafkaDemoApplication {

	public static void main(String[] args) {
		log.info("Starting......");
		SpringApplication.run(KafkaDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate) {
		return args -> {
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("amigoscode", "Hello Paul ! :)...count is "+i);
			}

		};
	}

}

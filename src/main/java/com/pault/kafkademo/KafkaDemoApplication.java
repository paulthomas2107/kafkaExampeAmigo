package com.pault.kafkademo;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class KafkaDemoApplication {

	public static void main(String[] args) {
		log.info("Starting......");
		SpringApplication.run(KafkaDemoApplication.class, args);
	}

}

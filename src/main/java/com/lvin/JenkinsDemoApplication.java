package com.lvin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@SpringBootApplication
public class JenkinsDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application initializing...");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
		logger.info("Application running...");
	}

}

package com.javatechie.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

public static	Logger l=LoggerFactory.getLogger(SpringJenkinsApplication.class);

//	@GetMapping("/ping")
//	public String message() {
//		return "Wao!! Application Deployed successfully in SAP Cloud..";
//	}
	
	@PostConstruct
	public void init() {
		l.info("Application started");
	}
	

	public static void main(String[] args) {
		l.info("Inside Main method");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}

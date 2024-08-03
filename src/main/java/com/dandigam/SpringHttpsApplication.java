package com.dandigam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHttpsApplication.class, args);
	}

	@PostConstruct
	public void prePost() {
		System.out.println("I am inserting data into db");
	}

	@GetMapping
	public String getHttpsMessage() {
		return "Getting HTTPS message";
	}

}

package com.azure.az_204;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Az204Application {

	@GetMapping("/Items")
	public String products()
	{
		return "Request Received .. !";
	}

	public static void main(String[] args) {
		SpringApplication.run(Az204Application.class, args);
	}

}

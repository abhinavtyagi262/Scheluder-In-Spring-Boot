package com.abhinav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FrontController extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(FrontController.class, args);
	}

}

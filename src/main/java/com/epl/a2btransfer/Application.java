package com.epl.a2btransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.epl.a2btransfer.controller","com.epl.a2btransfer.services"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}	
	
}

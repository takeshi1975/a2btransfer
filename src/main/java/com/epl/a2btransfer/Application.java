package com.epl.a2btransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.epl.a2btransfer.controller",
				"com.epl.a2btransfer.services", 
				"com.epl.a2btransfer.repositories",
				"com.epl.a2btransfer.components"})
public class Application extends SpringBootServletInitializer {	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("Se configura la aplicación");
		return application.sources(Application.class);
	}	

}

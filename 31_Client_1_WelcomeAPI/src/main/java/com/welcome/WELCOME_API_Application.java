package com.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WELCOME_API_Application {
	
	public static void main(String[] args) {
				
		SpringApplication.run(WELCOME_API_Application.class, args);
		System.out.println("WELCOME_API_Application start on Port : ");
	}

}

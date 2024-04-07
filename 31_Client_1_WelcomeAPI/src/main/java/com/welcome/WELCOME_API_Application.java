package com.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WELCOME_API_Application {

	public static void main(String[] args) {
		SpringApplication.run(WELCOME_API_Application.class, args);
		System.out.println("WELCOME_API_Application start on Port : 1111");
	}

}

package com.greetapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GREET_API_Application {

	public static void main(String[] args) {
		SpringApplication.run(GREET_API_Application.class, args);
		System.out.println("GREET_API_Application start on Port : 2222");
	}

}

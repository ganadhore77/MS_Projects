package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class API_GATEWAY_APP {

	public static void main(String[] args) {
		SpringApplication.run(API_GATEWAY_APP.class, args);
		System.out.println("API_GATEWAY_APP start on Port : 3333");
	}

}

package com.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Service_Registry_Application {

	public static void main(String[] args) {
		SpringApplication.run(Service_Registry_Application.class, args);
		System.out.println("Service Registry Application start on Port : 8761");
	}

}

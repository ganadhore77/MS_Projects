package com.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Admin_Server_Application {

	public static void main(String[] args) {
		SpringApplication.run(Admin_Server_Application.class, args);
		System.out.println("Admin Server Application start on Port : 8030");
	}

}

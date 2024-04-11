package com.welcome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class WelcomeController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/welcome")
	public String getMsg() {
		
		String port = environment.getProperty("server.port");
		
		String msg = "Welcome to WELCOME API ("+port+")";
		System.out.println("Welcome to WELCOME API ("+port+")");
		return msg;
		
	}
	
	@GetMapping("/welcomeNew")
	public String welcomeNew() {
		
		String port = environment.getProperty("server.port");
		
		String msg = "Welcome to WELCOME API NEW ("+port+")";
		System.out.println("Welcome to WELCOME API NEW ("+port+")");
		return msg;
		
	}
	
}
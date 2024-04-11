package com.greetapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class GreetController {

	@Autowired
	private WelcomeClient welcomeClient;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/greet")
	public String getMsg() {
		
		String port = environment.getProperty("server.port");
		
		String invokeWelcomeAPI = welcomeClient.invokeWelcomeAPI();
		
		String greetMsg = "Good Morning GREET API";
		System.out.println("Welcome to GREET API");
		return greetMsg.concat(" :: "+invokeWelcomeAPI);
		
	}
	
}

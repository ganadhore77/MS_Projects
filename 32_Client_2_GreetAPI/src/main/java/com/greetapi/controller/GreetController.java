package com.greetapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@Autowired
	private WelcomeClient welcomeClient;
	
	@GetMapping("/greet")
	public String getMsg() {
		
		String invokeWelcomeAPI = welcomeClient.invokeWelcomeAPI();
		
		String greetMsg = "Good Morning GREET API";
		System.out.println("Welcome to GREET API");
		return greetMsg.concat(" :: "+invokeWelcomeAPI);
		
	}
	
}

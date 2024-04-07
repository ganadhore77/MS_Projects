package com.welcome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getMsg() {
		
		String msg = "Welcome to WELCOME API";
		System.out.println("Welcome to WELCOME API");
		return msg;
		
	}
	
	
}

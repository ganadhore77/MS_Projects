package com.greetapi.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-API")
public interface WelcomeClient {

	@GetMapping("/api1/welcome")
	public String invokeWelcomeAPI();
	
}
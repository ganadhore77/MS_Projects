package com.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCOntroller {

	@Value("${msg}")
	public String msgTxt;
	
	{
		System.out.println("14 : "+msgTxt);
	}
	
	@GetMapping("/")
	public String getMsg() {
		System.out.println("19 : "+msgTxt);
		return msgTxt;
	}
	
}

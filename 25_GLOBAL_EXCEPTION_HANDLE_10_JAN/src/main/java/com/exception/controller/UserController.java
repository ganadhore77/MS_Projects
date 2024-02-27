package com.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exception.exception.NoUserFoundExcp;

@RestController
public class UserController {

	@GetMapping("/welcome")
	public String getMsg() {

		int i = 10 / 0;
		String msg = "Welcome to MS";
		return msg;
	}

	@GetMapping("/user/{id}")
	public String user(@PathVariable Integer id) {
		
		if(id < 100) {
			return "GANESH";
		} else {
			throw new NoUserFoundExcp("Invalid User ID");
		}
		
	}
}

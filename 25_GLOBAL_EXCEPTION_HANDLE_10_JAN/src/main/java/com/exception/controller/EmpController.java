package com.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@GetMapping("/emp")
	public String getMsg() {
		String s = null;
		s.length();
		String msg = "Welcome to MS";
		return msg;
	}
	
}

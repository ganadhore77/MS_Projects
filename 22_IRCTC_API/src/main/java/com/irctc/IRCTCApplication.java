package com.irctc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IRCTCApplication {

	public static void main(String[] args) {
		SpringApplication.run(IRCTCApplication.class, args);
		System.out.println("-----IRCTCApplication started on 8022 Port----");
	}

}

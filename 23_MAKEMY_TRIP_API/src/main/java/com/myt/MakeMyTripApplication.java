package com.myt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MakeMyTripApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeMyTripApplication.class, args);
		System.out.println("-----MakeMyTripApplication started on 8023 port-----");
	}

}

package com.irctc.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.bindings.Passenger;
import com.irctc.bindings.Ticket;
import com.irctc.service.TicketService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class TicketController {

	@Autowired
	private TicketService service;
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		
		Ticket bookTicket = service.bookTicket(passenger);
		
		return new ResponseEntity<>(bookTicket,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllTickets")
	public ResponseEntity<Collection<Ticket>> getAllTickets(){
		
		Collection<Ticket> allTickets = service.getAllTickets();
		
		return new ResponseEntity<Collection<Ticket>>(allTickets,HttpStatus.OK);
	}
	
}
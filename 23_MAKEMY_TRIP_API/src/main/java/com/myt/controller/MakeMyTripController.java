package com.myt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myt.binding.Passenger;
import com.myt.binding.Ticket;
import com.myt.service.MakeMyTripService;

@RestController
public class MakeMyTripController {

	@Autowired
	private MakeMyTripService service;

	@PostMapping("/bookMyTicket")
	public ResponseEntity<Ticket> bookMyTicket(@RequestBody Passenger p) {

		Ticket bookTicket = service.bookTicket(p);

		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.OK);
	}

	@GetMapping("/getTickets")
	public ResponseEntity<List<Ticket>> getTickets() {

		 List<Ticket> allTickets = service.getAllTickets();

		return new ResponseEntity<List<Ticket>>(allTickets, HttpStatus.OK);
	}

}

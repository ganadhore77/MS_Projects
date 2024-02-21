package com.myt.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.myt.binding.Passenger;
import com.myt.binding.Ticket;

@Service
public class MakeMyTripService {

	
	public Ticket bookTicket(Passenger p) {
		
		
		String url = "http://localhost:8022/ticket";
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<Ticket> getEntity = template.postForEntity(url, template, Ticket.class);
		
		Ticket body = getEntity.getBody();
		
		return body;
	}
	
}

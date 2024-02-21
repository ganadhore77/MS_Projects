package com.myt.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
		
		ResponseEntity<Ticket> getEntity = template.postForEntity(url, p, Ticket.class);
		
		Ticket body = getEntity.getBody();
		
		return body;
	}
	
	public List<Ticket> getAllTickets() {
		
		String url = "http://localhost:8022/getAllTickets";
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<Ticket[]> getEntity = template.getForEntity(url, Ticket[].class);
		
		Ticket[] body = getEntity.getBody();
		
		List<Ticket> asList = Arrays.asList(body);
		
		return asList;
	}
	
}

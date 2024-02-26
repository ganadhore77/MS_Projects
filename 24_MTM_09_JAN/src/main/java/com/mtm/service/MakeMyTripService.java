package com.mtm.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.mtm.binding.Passenger;
import com.mtm.binding.Ticket;

import reactor.core.publisher.Mono;

@Service
public class MakeMyTripService {
	
	public Mono<Ticket> bookTicket(Passenger p) {
		
		String url = "http://localhost:8022/ticket";
		
		WebClient webClient = WebClient.create();
		
		Mono<Ticket> bodyToMono = webClient.post()
					.uri(url)
					.body(BodyInserters.fromValue(p))
					.retrieve()
					.bodyToMono(Ticket.class);		
		
		return bodyToMono;
	}
	
	public Mono<Ticket[]> getAllTickets() {
		
		String url = "http://localhost:8022/getAllTickets";
		
		WebClient webClient = WebClient.create();
		
		Mono<Ticket[]> bodyToMono = webClient.get()
						.uri(url)
						.retrieve()
						.bodyToMono(Ticket[].class);		
		
		
		return bodyToMono;
	}
	

	
}

package com.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class QuoteService {

	private static final String QUOTE_END_POINT = "https://type.fit/api/quotes";

	/*
	 * Synchronous call implementation
	 */
	public void getQuote() {
		
		WebClient webClient = WebClient.create();

		System.out.println("Rest API call started");
		
		Mono<String> bodyToMono = webClient.get()
										.uri(QUOTE_END_POINT)
										.retrieve()
										.bodyToMono(String.class);
		
		System.out.println(bodyToMono.block());
		System.out.println("Rest API call completed");
	}
	
	
	/*
	 * Asynchronous call implementation
	 */
	public void getQuote1() {

		WebClient webClient = WebClient.create();

		System.out.println("Rest API call started");
		
			webClient.get()
				.uri(QUOTE_END_POINT)
				.header("Accept", "application/json")
				.retrieve()
				.bodyToMono(String.class)
				.subscribe(QuoteService::handleResponse);
	
		System.out.println("Rest API call completed");
	}
	
	public static void handleResponse(String response) {
		System.out.println(response);
	}

}

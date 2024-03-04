package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.binding.Book;

@RestController
public class BookController {

	@GetMapping(value = "/getBook", produces = {"application/xml","application/json"})
	public Book  getBook() {
	
		Book book = new Book(101,"JAVA",100.00);
		
		return book;
	}
	
	@PostMapping(value = "/addBook", consumes = {"application/xml","application/json"},produces = "text/plain")
	public String addBook(@RequestBody Book book) {
		System.out.println(book);
		return "Book added";
	}
	
}

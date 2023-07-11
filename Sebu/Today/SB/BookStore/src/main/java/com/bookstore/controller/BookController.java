package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.modal.Book;
import com.bookstore.service.BookService;

@RestController
public class BookController
{
	// injecting the service object.,
	@Autowired
	BookService bService;
	
	// Generating the API.,
	// 1. PostMapping for sending the data.,
	@PostMapping("/insertBook")
	public Book insertBook(@RequestBody Book bk)
	{
		return bService.insertBook(bk);
	}
}

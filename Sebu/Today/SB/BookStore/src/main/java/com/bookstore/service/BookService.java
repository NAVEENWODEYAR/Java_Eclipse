package com.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.modal.Book;
import com.bookstore.repo.BookRepo;
import com.bookstore.service.utility.MailSenderService;

@Service
public class BookService
{
	// inject the repository object
	@Autowired
	BookRepo bRepo;
	
	@Autowired
	MailSenderService mail;
	
	// CRUD operations.,
	// 1. insert the data
	public Book insertBook(Book bk)
	{
		Book b1 = bRepo.save(bk);
				mail.sendMail(bk.getaMail(), "New book"," New Book added to the collection successfully");
				
				return b1;
	}
}

package com.oignon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oignon.modal.Book;
import com.oignon.repo.BookRepo;

@Service
public class BookService 
{
	// DI
	@Autowired
	BookRepo bookRepo;
	
		// CRUD operations.,
	
		// 1. insert into the table
		public Book insertBook(Book book) 
		{
			return bookRepo.save(book);
		}
		
		// 2. insert into table values.,
		public List<Book> insertBooks(List<Book> book) 
		{
			List<Book> book1 = bookRepo.saveAll(book);
			return book1;
		}
		
		
		// 3. select from table.,
		public Book getBook(Integer bId) 
		{
			return bookRepo.findById(bId).get();
		}

		// 4. select * from book
		public List<Book> getBooks()
		{
			return bookRepo.findAll();
		}

		// 5. alter table 
		public Book updateBook(Integer bId, Book book)
		{
			Book book1 = bookRepo.findById(bId).get();
				book1.s
		}

		// 6. delete data from table
		public String deleteBook(Integer bId)
		{
			bookRepo.deleteById(bId);
			return "";
		}
		
		// 7. drop table
		public String deleteBooks()
		{
			 bookRepo.deleteAll();
			 return "";
		}

	
	

		

}

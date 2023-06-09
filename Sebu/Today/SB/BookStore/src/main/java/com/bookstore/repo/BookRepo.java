package com.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.modal.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> 
{

}

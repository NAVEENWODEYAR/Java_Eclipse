package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class BookStoreApplication
{

	public static void main(String[] args) 
	{
		System.out.println("Spring started..,");
		SpringApplication.run(BookStoreApplication.class, args);
	}

}

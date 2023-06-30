package com.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeMangoApplication 
{

	public static void main(String[] args) 
	{
		System.out.println("Started..,");
		SpringApplication.run(EmployeeMangoApplication.class, args);
	}

}

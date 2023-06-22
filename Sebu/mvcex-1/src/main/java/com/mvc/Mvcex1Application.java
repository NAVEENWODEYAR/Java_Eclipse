package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.mvc.controller"})

public class Mvcex1Application
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Mvcex1Application.class, args);
		System.out.println("Succuess");
	}

}

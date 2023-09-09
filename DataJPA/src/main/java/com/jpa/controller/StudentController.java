package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController
{
	// Dependency Injection(constructor)
	@Autowired
	private StudentService studentService;
	
	// API,
	@GetMapping("/testMsg")
	public String testMsg()
	{
		return "Mapping in JPA,";
	}
}

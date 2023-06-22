package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test 
{
//	@GetMapping
//	public ModelAndView getIndex()
//	{
//		System.out.println("Model View Controller..,");
//		return new ModelAndView ("index");
//	}
	
	@GetMapping("test")
	public String test()
	{
		System.out.println("Testing the whiteboard error..,");
		return "Good Night";
	}
}

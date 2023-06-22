package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloC 
{
	
	@GetMapping("index")
	public ModelAndView getIndex()
	{
		System.out.println("inside getIndex.,");
		return new ModelAndView("index");
	}
}

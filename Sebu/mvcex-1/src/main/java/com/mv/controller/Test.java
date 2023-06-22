package com.mv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test 
{
	@GetMapping("index")
	public ModelAndView getIndex()
	{
		System.out.println("mvc pattern..,");
		return new ModelAndView("index");
	}
}

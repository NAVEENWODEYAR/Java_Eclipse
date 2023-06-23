package com.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Panther 
{
	// url..,
	@GetMapping("/index")
	public ModelAndView getIndex()
	{
		System.out.println("inside the index page..,");
		return new ModelAndView("index");
	}
	
	@GetMapping("/about")
	public String getAbout(Model md)
	{
		md.addAttribute("date", new Date());
		return "about";
	}

}

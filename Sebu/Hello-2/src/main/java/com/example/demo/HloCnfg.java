package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HloCnfg 
{
	@RequestMapping("/v")
	public String hlo()
	{
		return "Welcome to springBoot..,";
	}

}

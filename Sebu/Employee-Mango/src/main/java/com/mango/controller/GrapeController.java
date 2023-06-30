package com.mango.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mango.modal.Grape;
import com.mango.service.GrapeService;

@RestController
public class GrapeController 
{
	// injecting the object..,
	@Autowired
	GrapeService gService;
	
	// generate the API's
	// 1. post for sending the data.,
	@PostMapping("/insertGrapeData")
	public Grape insertGrapeData(@RequestBody Grape gp)
	{
		return gService.insertGrapeData(gp);
	}
	
	// 2. get for receiving the data,,
	@GetMapping("/getGrapeData")
	public List<Grape> getGrapeData(List<Grape> gp)
	{
		List<Grape> g1 = gService.getGrapeData(gp);
					return g1;
	}
}

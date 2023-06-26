package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.modal.Employe;
import com.mvc.service.EmployeService;

@RestController
public class EmployeController
{
	@Autowired
	EmployeService eservice;
	// generating the API
	@PostMapping("/addRow")
	public Employe insertData(@RequestBody Employe emp)
	{
		Employe e1 = eservice.insertData(emp);
		return e1;
	}
	@GetMapping("/getRow")
	public List<Employe> getData()
	{
		return eservice.getData();
	}
}

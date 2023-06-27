package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.modal.Employee;
import com.mvc.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService eService;
	
	// generating the API.,
	
	// 1. post for sending the data.,
	@PostMapping("/insertRow")
	public List<Employee> insertData(@RequestBody List<Employee> emp)
	{
		List<Employee> lt = eService.insertData(emp);
		return lt;
	}
	
	// 2. get for receiving the data.,
	@GetMapping("/getRow")
	public List<Employee> getData()
	{
		return eService.getData();
	}
	
	// 2. put for updating the data.,
	@PutMapping("/updateRow/{Id}")
	public Employee updateData(@PathVariable int Id,@RequestBody Employee emp)
	{
		return eService.updateData(Id, emp);
	}
	
	// 4. delete for deleting the data.,
	@DeleteMapping("/deleteRow/{Id}")
	public String deleteRow(@PathVariable int Id)
	{
		eService.deleteData(Id);
		return "Deleted,,,";
	}
}

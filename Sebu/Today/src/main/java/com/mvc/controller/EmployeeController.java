package com.mvc.controller;

import com.mvc.dto.*;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

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
	
	// generating the API's.,
	
	// 1. post for sending the data.,
	@PostMapping("/insertRow")
	public ResponseEntity<EmployeeDTO> insertData(@RequestBody List<Employee> emp)
	{
		List<Employee> lt = eService.insertData(emp);
		EmployeeDTO eDto = new EmployeeDTO("Data inserted..,",lt);
		return new ResponseEntity<>(eDto,HttpStatus.ACCEPTED);
	}
	
	// 2. get for receiving the data.,
	@GetMapping("/getRow")
//	public List<Employee> getData()
	public ResponseEntity<EmployeeDTO> getData()
	{	
		List<Employee> lt = eService.getData();
		EmployeeDTO eDto = new EmployeeDTO("Getting the data.,",lt);
		return new ResponseEntity<>(eDto,HttpStatus.FOUND);
	}
	
	// 3. put for updating the data.,
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

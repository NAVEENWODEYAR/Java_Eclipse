package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.dto.ResponseDTO;
import com.mvc.modal.Company;
import com.mvc.service.CompanyService;

@RestController
@CrossOrigin
public class CompanyController 
{
	@Autowired
	CompanyService cService;
	
	// post for inserting the data.,
	@PostMapping("/insertCompanyData")
//	public List<Company> insertCompanyData(@RequestBody List<Company> cmp)
	public ResponseEntity<ResponseDTO> insertCompanyData(@RequestBody List<Company> cmp)
	{
		List<Company> lt = cService.insertCompanyData(cmp);
		ResponseDTO cDTO = new ResponseDTO("Data inserted successfully", cmp);
		return new ResponseEntity<>(cDTO,HttpStatus.CREATED);
	}
	
	// get 
	@GetMapping("/getCompanyData")
//	public List<Company> getCompanyData()
	public ResponseEntity<ResponseDTO>getCompanyData()
	
	{
		List<Company> lt = cService.getCompanyData();
		ResponseDTO cDTO = new ResponseDTO("select * from company,",lt);
		return new ResponseEntity<>(cDTO,HttpStatus.ACCEPTED);
	}
	
	// put for updating the data.,
	@PutMapping("updateCompanyData/{c_Id}")
//	public Company updateCompany(@PathVariable Integer c_Id,@RequestBody Company cmp)
	public ResponseEntity<ResponseDTO>updateCompany(@PathVariable Integer c_Id, @RequestBody Company cmp)
	{
		Company c1 = cService.updateCompanyData(c_Id, cmp);
		ResponseDTO cDTO = new ResponseDTO("Updated the data", c1);
		return new ResponseEntity<>(cDTO,HttpStatus.ACCEPTED);
	}
	
	// delete
	@DeleteMapping("deleteCompany/{c_Id}")
//	public String deleteCompanyData(@PathVariable Integer c_Id)
	public ResponseEntity<ResponseDTO>deleteCompany(@PathVariable Integer c_Id)
	{
		String st = cService.deleteCompanyData(c_Id);
		ResponseDTO cDTO = new ResponseDTO("Delted record successfully", st);
		return new ResponseEntity<ResponseDTO>(cDTO,HttpStatus.CREATED);
	}
}

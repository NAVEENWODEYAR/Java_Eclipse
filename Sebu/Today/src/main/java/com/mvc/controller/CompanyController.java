package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public List<Company> insertCompanyData(@RequestBody List<Company> cmp)
	{
		List<Company> lt = cService.insertCompanyData(cmp);
		return lt;
	}
	
	// get 
	@GetMapping("/getCompanyData")
	public List<Company> getCompanyData()
	{
		return cService.getCompanyData();
	}
	
	// put for updating the data.,
	@PutMapping("updateCompanyData/{c_Id}")
	public Company updateCompany(@PathVariable Integer c_Id,@RequestBody Company cmp)
	{
		return cService.updateCompanyData(c_Id, cmp);
	}
	
	// delete
	@DeleteMapping("deleteCompany/{c_Id}")
	public String deleteCompanyData(@PathVariable Integer c_Id)
	{
		cService.deleteCompanyData(c_Id);
		return "Successfully dleted the data";
	}
}

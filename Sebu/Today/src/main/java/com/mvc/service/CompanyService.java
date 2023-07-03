package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modal.Company;
import com.mvc.repo.CompanyRepo;

@Service
public class CompanyService
{
	@Autowired
	CompanyRepo cRepo;
	
	// CRUD operations.,
	// 1. insert the data.,
	public List<Company> insertCompanyData(List<Company> cmp)
	{
		List<Company> c1 = cRepo.saveAll(cmp);
					return c1;
	}
	
	// 2. selecting the data.,
	public List<Company> getCompanyData()
	{
		return cRepo.findAll();
	}
	
	// 3. update the data.,
	public Company updateCompanyData(Integer c_Id, Company cmp)
	{
		Company c1 = cRepo.findById(c_Id).get();
		
				c1.setC_Name(cmp.getC_Name());
				c1.setC_Address(cmp.getC_Address());
				c1.setC_Type(cmp.getC_Type());
				c1.setC_Website(cmp.getC_Website());
				
				return cRepo.save(c1);		
	}
	
	// 4. deleting the data.,
	public String deleteCompanyData(Integer c_Id)
	{
		cRepo.deleteById(c_Id);
		return " ";
	}
}

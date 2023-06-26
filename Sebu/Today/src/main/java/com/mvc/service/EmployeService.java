package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modal.Employe;
import com.mvc.repo.EmployeeRepo;

@Service
public class EmployeService 
{

	// autowiring the repository object
	@Autowired
	EmployeeRepo erepo;
	
	// SQL queries.,
	// 1. create table.,
	public Employe insertData(Employe emp)
	{
		return erepo.save(emp);
	}
	
	// 2. select row.,
	public List<Employe> getData()
	{
		return erepo.findAll();
	}
}

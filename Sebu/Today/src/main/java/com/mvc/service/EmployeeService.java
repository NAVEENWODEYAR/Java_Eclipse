package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modal.Employee;
import com.mvc.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepo eRepo;
	
	// CRUD operations on the database.,
	// 1. insert the data
	public List<Employee> insertData(List<Employee> emp)
	{
		List<Employee> lt = eRepo.saveAll(emp);
		return lt;
	}
	
	// 2. select the data.,
	public List<Employee> getData()
	{
		return eRepo.findAll();
	}
	
	// 3. update query.,
	public Employee updateData(int Id, Employee emp)
	{
		Employee emp1 = eRepo.findById(Id).get();
				emp1.seteName(emp.geteName());
				emp1.setAge(emp.getAge());
				emp1.seteAddress(emp.geteAddress());
				emp1.seteSalary(emp.geteSalary());
				emp1.seteGender(emp.geteGender());
				
				return eRepo.save(emp1);
	}
	
	// 4. delete query.,
	public String deleteData(int Id)
	{
		eRepo.deleteById(Id);
		return " ";
	}
}

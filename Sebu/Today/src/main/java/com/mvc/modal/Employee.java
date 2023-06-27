package com.mvc.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee 
{
	// table column Id,,
	@Id
	private int eId;
	private int age;
	private String eName;
	private String eGender;
	private String eAddress;
	private double eSalary;
	
	// constructor,
	public Employee()
	{
		// default constructor..,
	}
	
	// parameterized constructor.,
	public Employee(int eId, int age, String eName, String eGender, String eAddress, double eSalary) {
		super();
		this.eId = eId;
		this.age = age;
		this.eName = eName;
		this.eGender = eGender;
		this.eAddress = eAddress;
		this.eSalary = eSalary;
	}


	// Setters and getters.,
	public int geteId()
	{
		return eId;
	}
	public void seteId(int eId)
	{
		this.eId = eId;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String geteName() 
	{
		return eName;
	}
	public void seteName(String eName) 
	{
		this.eName = eName;
	}
	public String geteGender()
	{
		return eGender;
	}
	public void seteGender(String eGender)
	{
		this.eGender = eGender;
	}
	public String geteAddress() 
	{
		return eAddress;
	}
	public void seteAddress(String eAddress) 
	{
		this.eAddress = eAddress;
	}
	public double geteSalary() 
	{
		return eSalary;
	}
	public void seteSalary(double eSalary)
	{
		this.eSalary = eSalary;
	}
	
}

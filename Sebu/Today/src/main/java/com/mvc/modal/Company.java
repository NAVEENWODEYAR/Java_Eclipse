package com.mvc.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Company
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_Id;
	private String c_Name;
	private String c_Address;
	private String c_Type;
	private String c_Website;
		
		// default constructor.,
			public Company()
			{
				
			}
		// parameterized constructor.,
			public Company(String c_Name, String c_Address, String c_Type, String c_Website)
			{
				super();
				this.c_Name = c_Name;
				this.c_Address = c_Address;
				this.c_Type = c_Type;
				this.c_Website = c_Website;
			}
			
		// parameterized constructor.,
			public Company(int c_Id, String c_Name, String c_Address, String c_Type, String c_Website) 
			{
				super();
				this.c_Id = c_Id;
				this.c_Name = c_Name;
				this.c_Address = c_Address;
				this.c_Type = c_Type;
				this.c_Website = c_Website;
			}
			// setters & getters.,
			public int getC_Id() {
				return c_Id;
			}
			public void setC_Id(int c_Id) {
				this.c_Id = c_Id;
			}
			public String getC_Name() {
				return c_Name;
			}
			public void setC_Name(String c_Name) {
				this.c_Name = c_Name;
			}
			public String getC_Address() {
				return c_Address;
			}
			public void setC_Address(String c_Address) {
				this.c_Address = c_Address;
			}
			public String getC_Type() {
				return c_Type;
			}
			public void setC_Type(String c_Type) {
				this.c_Type = c_Type;
			}
			public String getC_Website() {
				return c_Website;
			}
			public void setC_Website(String c_Website) {
				this.c_Website = c_Website;
			}
				
}

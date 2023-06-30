package com.mango.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Grape 
{	@Id
	private String id;
	private int f_Id;
	private String f_Name;
	
	// Constructor..,
	public Grape(int f_Id, String f_Name) 
	{
		super();
		this.f_Id = f_Id;
		this.f_Name = f_Name;
	}
	public Grape()
	{
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getF_Id() {
		return f_Id;
	}
	public void setF_Id(int f_Id) {
		this.f_Id = f_Id;
	}
	public String getF_Name() {
		return f_Name;
	}
	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}
	@Override
	public String toString() {
		return "Grape [id=" + id + ", f_Id=" + f_Id + ", f_Name=" + f_Name + "]";
	}
	
		
}

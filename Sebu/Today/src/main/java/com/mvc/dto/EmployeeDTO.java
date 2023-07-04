package com.mvc.dto;

public class EmployeeDTO 
{

	String msg;
	Object obj;
	
	public EmployeeDTO()
	{
		
	}
	
	public EmployeeDTO(String msg, Object obj)
	{
		super();
		this.msg = msg;
		this.obj = obj;
	}

	public String getMsg() 
	{
		return msg;
	}

	public void setMsg(String msg) 
	{
		this.msg = msg;
	}

	public Object getObj() 
	{
		return obj;
	}

	public void setObj(Object obj) 
	{
		this.obj = obj;
	}

	@Override
	public String toString() 
	{
		return "EmployeeDTO [msg=" + msg + ", obj=" + obj + ", getMsg()=" + getMsg() + ", getObj()=" + getObj()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

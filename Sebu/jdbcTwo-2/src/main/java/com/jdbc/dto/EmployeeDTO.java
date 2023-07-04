package com.jdbc.dto;


public class EmployeeDTO 
{
	String msg;
	Object obj;
	
	// constructor.,
	public EmployeeDTO()
	{
		
	}
	
	// parameterized constructor.,
	public EmployeeDTO(String msg, Object obj)
	{
		this.msg = msg;
		this.obj = obj;
	}
	
		// toString()	
		@Override
	public String toString()
	{
		return "EmployeeDTO [msg=" + msg + ", obj=" + obj + ", getMsg()=" + getMsg() + ", getObj()=" + getObj()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

		// setters and getters.,
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
		
	
}

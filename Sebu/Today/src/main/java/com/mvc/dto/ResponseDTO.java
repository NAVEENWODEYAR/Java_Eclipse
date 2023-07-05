package com.mvc.dto;


public class ResponseDTO 
{
	String msg;
	Object obj;
	
	// constructor
	public ResponseDTO(String msg, Object obj) 
	{
		super();
		this.msg = msg;
		this.obj = obj;
	}

	// setters & getters..,
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

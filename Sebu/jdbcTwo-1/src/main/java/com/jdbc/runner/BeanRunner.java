package com.jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jdbc.dao.Tabl_Class;

@Component
public class BeanRunner implements CommandLineRunner 
{
	@Autowired
	Tabl_Class tbl;
	
	@Override
	public void run(String... args) throws Exception 
	{
	tbl.insertValues();
	List l = tbl.getValues();
	l.forEach(v-> System.out.println(v));
		
	}

}

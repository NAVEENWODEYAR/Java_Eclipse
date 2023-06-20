package com.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Tabl_Class implements Tabl_Interface 
{
	@Autowired
	JdbcTemplate j;
	
		@Override
		public void insertValues() 
		{
		//insert query
			j.update("insert into student values (1,'Ammie',10,'A')");
			j.update("insert into student values (1,'Ammie',10,'A')");
			j.update("insert into student values (1,'Ammie',10,'A')");
			j.update("insert into student values (1,'Ammie',10,'A')");
		}
	
		@Override
		public List getValues() 
		{
			return j.queryForList("Select * from student");
		}

}

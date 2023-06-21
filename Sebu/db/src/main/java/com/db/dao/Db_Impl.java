package com.db.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Db_Impl implements Db 
{
	@Autowired
	JdbcTemplate jd;
	
		@Override
		public void createDb() 
		{
			// create db;
			jd.update("create database hh");
			System.out.println("Database created successfully..,");
		}
	
		@Override
		public void useDb() 
		{
			// use db;
			jd.update("use hh");
			System.out.println("Database changed..,");
		}
	
		@Override
		public void createTable() 
		{
			// create query
			jd.update("create table h1(id integer, name varchar(40))");
			System.out.println("Table created successfully..,");
			
		}
	
		@Override
		public void insertData() 
		{
			// insert query
			jd.update("insert into h1 values(9,'Nancy')");
			System.out.println("Data inserted successfully..,");
	
		}
	
		@Override
		public List getData()
		{
			// Select query
			return jd.queryForList("Select * from h1");
		}

}

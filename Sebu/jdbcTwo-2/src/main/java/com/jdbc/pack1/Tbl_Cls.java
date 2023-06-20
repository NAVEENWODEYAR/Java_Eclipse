package com.jdbc.pack1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Tbl_Cls implements Tbl 
{
	@Autowired
	JdbcTemplate jd;
	
		@Override
		public void insertData() 
		{
			// insert query
			jd.update("insert into bus values(100, 'Jennie',10.00, 'AC')");
			jd.update("insert into bus values(101, 'Alakuntla Vasu',15.00, 'Sleeper')");
		}
	
		@Override
		public List getData()
		{
			// select query
			return jd.queryForList("Select * from bus");
		}

		@Override
		public void createTable() 
		{
			//create table query
//			jd.update("create table bus(bId integer,bName varchar(20),tCost float, bus_Type varchar(20))");
//			System.out.println("Table created successfully..,");
		}

		@Override
		public void deleteRow() 
		{
			// delete the records..,
//			jd.update("delete from bus where bus_Type ='Sleeper");
//			System.out.println("Successfully removed the data from the table..,");
		}
}

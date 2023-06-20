package jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jdbc.dao.Table_Impl;

@Component
public class Runr_Ex implements CommandLineRunner 
{
	@Autowired
	Table_Impl tbl;
	
	@Override
	public void run(String... args) throws Exception 
	{	
		// inserting the data into the table..,
		tbl.insertData();
		
		// getting the records from the table..,
		List lt = tbl.getData();
		lt.forEach(r-> System.out.println(r));
	}

}
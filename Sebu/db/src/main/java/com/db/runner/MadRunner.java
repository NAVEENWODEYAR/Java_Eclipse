package com.db.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.db.dao.Db_Impl;

public class MadRunner implements CommandLineRunner
{
	// injecting the object,,
	@Autowired
	Db_Impl db;
	
		@Override
		public void run(String... args) throws Exception 
		{
			db.createDb();
			db.useDb();
			db.createTable();
			db.insertData();
			List l = db.getData();
			l.forEach(d -> System.out.println(d));
	
		}
}

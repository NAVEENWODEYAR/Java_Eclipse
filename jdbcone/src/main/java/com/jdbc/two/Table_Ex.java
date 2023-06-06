package com.jdbc.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table_Ex
{

	public static void main(String[] args) 
	{
		// Create table in the database from the java program.,
	
		try
		{	//1. load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","boss");
			
			// 3. create the statement
			Statement st = con.createStatement();
						st.executeLargeUpdate("create table student(sid int, sname varchar(50), class int, gender varchar(20))");
						System.out.println("Sucessfully created the table");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}

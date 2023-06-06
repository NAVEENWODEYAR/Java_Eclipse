package com.jdbc.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Ex 
{

	public static void main(String[] args) 
	{
		// Inserting the data into the table
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","boss");
			Statement st = cn.createStatement();
						st.executeLargeUpdate("insert into student values(1,'Bhas',10,'Male')");
						st.executeLargeUpdate("insert into student values(2,'Candy',10,'Female')");
						st.executeLargeUpdate("insert into student values(3,'Danny',10,'Male')");
						st.executeLargeUpdate("insert into student values(4,'Emma',10,'Female')");
						System.out.println("Values inserted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

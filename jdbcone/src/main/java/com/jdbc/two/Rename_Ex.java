package com.jdbc.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Rename_Ex 
{

	public static void main(String[] args) throws Exception
	{
		// Rename command
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","boss");
		Statement st = con.createStatement();
					st.executeUpdate("rename table student To st_new ");
					System.out.println("Renamed successfullt");

	}

}

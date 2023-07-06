package com.jdbc.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Ex
{

	public static void main(String[] args) throws Exception
	{
		// Deleting the records from the table using the java
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","boss");
		Statement st = cn.createStatement();
					st.executeUpdate("delete from student where sid='3'");
					System.out.println("Successfully deletd the record");

	}

}

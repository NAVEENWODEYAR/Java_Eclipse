package com.jdbc.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_Ex 
{

	public static void main(String[] args) throws Exception 
	{
		// Reading the data from the database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql:4//localhost:3306/javadb","root","boss");
		Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
				while(rs.next())
				{
					int id = rs.getInt("sid");
					String name = rs.getString("sname");
					int cls = rs.getInt("class");
					String gender = rs.getString("gender");
					System.out.println("Student ID- "+id+ " ,Name- "+name +" ,Class- " +cls+" ,gender-"+gender);
				}
		 
	}

}

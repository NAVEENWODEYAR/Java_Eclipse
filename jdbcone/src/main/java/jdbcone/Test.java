package jdbcone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
	 try {
		//loaddriver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","boss");
			
			Statement st=con.createStatement();
			
			st.executeUpdate("create table employee(id int, name varchar(32), salary int)");
			
			System.out.println("Table Created successfully");
	 }
	 catch(Exception e) 
	 {
		 e.printStackTrace();
	 }

	}

}

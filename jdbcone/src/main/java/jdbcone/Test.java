package jdbcone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
	 try {
		//1. Load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2.Establish connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","boss");
			
			// 3. Create the statement
			Statement st=con.createStatement();
			
			st.executeUpdate("create table employee(id int, name varchar(32), salary int)");
			
			System.out.println("Table Created Successfully");
			
			// 4. Close the connection..,
			con.close();
	 }
	 catch(Exception e) 
	 {
		 e.printStackTrace();
	 }

	}

}

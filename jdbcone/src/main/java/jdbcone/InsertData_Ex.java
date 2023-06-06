package jdbcone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData_Ex {

	public static void main(String[] args) throws Exception 
	{
		// Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Establishing the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "boss");
		//Create statement
		Statement st = c.createStatement();
			st.executeUpdate("insert into employee values (1,'Vasu',95123)");
			st.executeUpdate("insert into employee values (2,'Balu',75123)");
			st.executeUpdate("insert into employee values (3,'Ramu',65123)");
		
		System.out.println("Data inserted successfully");
			c.close();
	}

}

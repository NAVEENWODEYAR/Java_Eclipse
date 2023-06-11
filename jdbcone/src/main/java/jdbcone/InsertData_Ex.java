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
			st.executeUpdate("insert into employe values (1,'Vasu',95123,'v@gmail.com')");
			st.executeUpdate("insert into employee values (2,'Balu',75123)");
			st.executeUpdate("insert into employe values (3,'Ramu',65123,'r@gmail.com')");
			st.executeUpdate("insert into employee values (4,'Fanny',34123)");
			st.executeUpdate("insert into employe values (5,'Emma',94123,'e@gmail.com')");
			st.executeUpdate("insert into employee values (6,'Florence',84123)");
			st.executeUpdate("insert into employe values (7,'Gene',74123,'g@gmail.com')");
			st.executeUpdate("insert into employee values (8,'Helen',34123)");
			st.executeUpdate("insert into employe values (9,'Ian',97123,'i@gmail.com')");
		
		System.out.println("Data inserted successfully");
			c.close();
	}

}

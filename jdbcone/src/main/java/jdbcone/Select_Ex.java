package jdbcone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_Ex 
{

	public static void main(String[] args) throws Exception
	{
		// Select Query
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","boss");
		Statement st = co.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				System.out.println("Employee id-"+ id + " Name-"+name+" Salary-"+sal);
			}
	}

}

package jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Table_Impl implements Table_Ex 
{
	@Autowired
	JdbcTemplate j; 
	
	@Override
	public void insertData() 
	{
		// insert query..,
		j.update("insert into emp values(1, 'Bhas',95000.00)");
		j.update("insert into emp values(2, 'Monu',85000.00)");
		j.update("insert into emp values(3, 'Murali',90000.00)");
		j.update("insert into emp values(4, 'Aparna',85000.00)");
		j.update("insert into emp values(5, 'Naveen',99000.00)");
		
	}

	@Override
	public List getData()
	{
		// select statement..,
		return j.queryForList("Select * from emp");
	}

}

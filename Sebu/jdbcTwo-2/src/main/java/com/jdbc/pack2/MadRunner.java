package com.jdbc.pack2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jdbc.pack1.Tbl_Cls;

@Component
public class MadRunner implements CommandLineRunner 
{
	@Autowired
	Tbl_Cls tb;
	
		@Override
		public void run(String... args) throws Exception 
		{
			// invoking the methods..,
			// 1. create the table.,,
			tb.createTable();
			
			// 2. insert the values.,
			tb.insertData();
			
			// 3. select the data.,
			List l = tb.getData();
				l.forEach(s -> System.out.println(s));
			
			// 4. delete the records.,
				tb.deleteRow();
		}

}

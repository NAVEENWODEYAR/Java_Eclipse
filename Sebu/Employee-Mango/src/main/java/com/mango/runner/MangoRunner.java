package com.mango.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mango.modal.Mango;
import com.mango.service.MangoService;

@Component
public class MangoRunner implements CommandLineRunner 
{
	@Autowired
	MangoService mService;
	
	@Override
	public void run(String... args) throws Exception 
	{
		mService.insertMangoData(new Mango(1,"Alphonso","Devgad",23.00));
		mService.insertMangoData(new Mango(6,"Banganapalle","",27.00));
		mService.insertMangoData(new Mango(4,"Langra","Varanasi",83.00));
		mService.insertMangoData(new Mango(7,"Totapuri","South India",93.00));
		mService.insertMangoData(new Mango(9,"Berry","South India",93.00));

		
		
	}

}

package com.mango.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mango.modal.Grape;
import com.mango.service.GrapeService;

@Component
public class GrapeRunner implements CommandLineRunner 
{
	
	@Autowired
	GrapeService gService;
	
		@Override
		public void run(String... args) throws Exception
		{
			// insert the data..,
			gService.insertGrapeData(new Grape(1,"Malgudi"));
			gService.insertGrapeData(new Grape(2,"Alpa"));
			gService.insertGrapeData(new Grape(8,"Beta"));
			gService.insertGrapeData(new Grape(7,"Gamma"));
			gService.insertGrapeData(new Grape(10,"Delta"));
			gService.insertGrapeData(new Grape(21,"Epsilon"));
			gService.insertGrapeData(new Grape(151,"Zeta"));

			
			// select the data
//			gService.getGrapeData(List<Grape> gp);

		}
}

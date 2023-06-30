package com.mango.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mango.modal.Mango;
import com.mango.repo.MangoRepo;

@Service
public class MangoService
{
	// inject the object..,
	@Autowired
	MangoRepo mRepo;
	
	// CRUD operations.,
	// insert the data.,
	public Mango insertMangoData(Mango mg)
	{
		Mango lt = mRepo.save(mg);
				return lt;
	}
}

package com.mango.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mango.modal.Grape;
import com.mango.repo.GrapeRepo;

@Service
public class GrapeService 
{
	@Autowired
	GrapeRepo gRepo;
	
	// CRUD operations..,
	// 1. insert the data. db.collection.insertOne()
	public Grape insertGrapeData(Grape g)
	{
		Grape g1 = gRepo.save(g);
			return g1;
	}
	
	// 2. select the data, db.collection.find().pretty().,
	public List<Grape> getGrapeData(List<Grape> gp)
	{
		return gRepo.findAll();
	}
	
	// 3. select the data by ID
	public Grape getGtape(String id)
	{
		return gRepo.findById(id).get();
	}
	
	// 4. delete the data , db.collection.drop
	public String deleteGrapeData(String id)
	{
		gRepo.deleteById(id);
		gRepo.delete(null);
		return "";
	}
	
	// 5.  update the collection., db.collection.updateOne.,
	public Grape deleteGrapeData(String id,Grape gp)
	{
		Grape g1 = gRepo.findById(id).get();
				g1.setF_Id(gp.getF_Id());
				g1.setF_Name(gp.getF_Name());
				
				return gRepo.save(g1);
	}
	
}

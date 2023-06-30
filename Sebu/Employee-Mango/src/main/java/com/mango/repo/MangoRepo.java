package com.mango.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mango.modal.Mango;

@Repository
public interface MangoRepo extends MongoRepository<Mango, String>
{
	// MongoRepository.,
}

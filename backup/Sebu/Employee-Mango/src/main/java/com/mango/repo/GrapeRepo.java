package com.mango.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mango.modal.Grape;

@Repository
public interface GrapeRepo extends MongoRepository<Grape, String> 
{

}

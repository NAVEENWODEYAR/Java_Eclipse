package com.oignon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oignon.modal.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> 
{
	public void findByuName(String uName);
}

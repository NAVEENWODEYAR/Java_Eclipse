package com.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.modal.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> 
{

}

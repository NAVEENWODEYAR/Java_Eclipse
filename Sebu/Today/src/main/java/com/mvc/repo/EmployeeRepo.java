package com.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.modal.Employe;

@Repository
public interface EmployeeRepo extends JpaRepository<Employe,Integer>
{

}

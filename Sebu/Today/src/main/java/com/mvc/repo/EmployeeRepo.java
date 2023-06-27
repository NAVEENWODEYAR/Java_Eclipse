package com.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.modal.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{
 // repository extends JpaRepository.,
}

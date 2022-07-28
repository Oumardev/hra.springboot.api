package com.hrassoc.HRA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrassoc.HRA.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
}

package com.hrassoc.HRA.service;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hrassoc.HRA.model.Employee;
import com.hrassoc.HRA.repository.EmployeeRepository;

import java.util.Optional;

import lombok.Data;

@Data
@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public void deleteEmployee(Employee employee){
        employeeRepository.delete(employee);
    }

    public Employee saveEmployee(Employee employee){

        Employee savedemployee = employeeRepository.save(employee);
        return savedemployee;
    }

}

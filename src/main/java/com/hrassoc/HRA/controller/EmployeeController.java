package com.hrassoc.HRA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hrassoc.HRA.model.Employee;
import com.hrassoc.HRA.service.EmployeeService;
import java.util.Optional;;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        Employee employedSave;

        employedSave = employeeService.saveEmployee(employee);

        return employedSave;
    }

    @GetMapping("/employee")
    public Iterable<Employee> getEmployee(){
        return employeeService.getEmployee();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeById(@PathVariable("id") final Long id){
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/employee")
    public void deleteEmployee(Employee employee){
        employeeService.deleteEmployee(employee);
    }
}

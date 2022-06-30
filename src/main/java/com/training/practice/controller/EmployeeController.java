package com.training.practice.controller;


import com.training.practice.entity.Employee;
import com.training.practice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    public EmployeeService employeeService;

    @GetMapping("allEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = null;
        try{
            employees = employeeService.getAllEmployee();

        }
        catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }
}

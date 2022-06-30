package com.training.practice.controller;


import com.training.practice.entity.Employee;
import com.training.practice.service.EmployeeService;
import com.training.practice.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("all-employee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = null;
        try{
            employees = employeeService.getAllEmployee();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int Employee_id ){
        Employee employees = null;
        try{
            employees = employeeService.getEmployeeById(Employee_id);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return new ResponseEntity<Employee>(employees, HttpStatus.OK);
    }

    @PostMapping ("/add-or-update")
    public ResponseEntity<Employee> addOrUpdateEmployee(@RequestBody Employee employee ){
        Employee employees = null;
        try{
            employees = employeeService.addOrUpdateEmployee(employee);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return new ResponseEntity<Employee>(employees, HttpStatus.OK);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int Employee_id ){
        Employee employees = null;
        try{
            employees = employeeService.deleteEmployee(Employee_id);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return new ResponseEntity<Employee>(employees, HttpStatus.OK);
    }
}

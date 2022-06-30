package com.training.practice.service.impl;

import com.training.practice.entity.Employee;
import com.training.practice.repository.EmployeeRepository;
import com.training.practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        System.out.println("hello");
        List<Employee> emp =  employeeRepository.findAll();
        System.out.println(emp);
        return emp;
    }

    @Override
    public Employee getEmployeeById(int Employee_id) {
        return employeeRepository.findById(Employee_id).orElse(null);
    }

    @Override
    public Employee addOrUpdateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee deleteEmployee(int Employee_id) throws Exception {
        Employee deteleEmployee = null;
        try{
            deteleEmployee = employeeRepository.findById(Employee_id).orElse(null);
            if(deteleEmployee == null){
                throw new Exception("Employee not found");
            }
            else{
                employeeRepository.deleteById(Employee_id);
            }

        }
        catch (Exception ex){
            throw ex;
        }
        return deteleEmployee;
    }
}

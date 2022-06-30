package com.training.practice.service;

import com.training.practice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(int Employee_id);
    public Employee addOrUpdateEmployee(Employee employee);
    public Employee deleteEmployee(int Employee_id);
}

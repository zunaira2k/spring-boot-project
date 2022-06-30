package com.training.practice.entity;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "demo")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employee_id;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    @Column(name = "salary")
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Column(name = "age")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Employee() {
        super();
    }

    public Employee(int employee_id, float salary, int age, String name) {
        this.employee_id = employee_id;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

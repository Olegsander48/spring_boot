package com.udemy.boot.repository;

import com.udemy.boot.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee findById(int id);

    void remove(int id);
}

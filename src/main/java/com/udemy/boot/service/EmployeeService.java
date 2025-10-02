package com.udemy.boot.service;


import com.udemy.boot.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee findById(int id);

    void remove(int id);
}

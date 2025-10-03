package com.udemy.boot.service;


import com.udemy.boot.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Optional<Employee> findById(int id);

    void remove(int id);
}

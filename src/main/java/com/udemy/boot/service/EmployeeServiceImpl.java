package com.udemy.boot.service;

import com.udemy.boot.model.Employee;
import com.udemy.boot.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeDao;

    public EmployeeServiceImpl(EmployeeRepository employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void remove(int id) {
        employeeDao.deleteById(id);
    }
}

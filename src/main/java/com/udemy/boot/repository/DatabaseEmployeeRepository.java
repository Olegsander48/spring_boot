package com.udemy.boot.repository;

import com.udemy.boot.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatabaseEmployeeRepository implements EmployeeRepository {
    private final EntityManager entityManager;

    public DatabaseEmployeeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void remove(int id) {
        Query query = entityManager.createQuery("delete from Employee where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

}

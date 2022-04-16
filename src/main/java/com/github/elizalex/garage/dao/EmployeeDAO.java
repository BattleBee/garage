package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAll();

    void save(Employee employee);

    Employee get(int id);

    void delete(int id);
}

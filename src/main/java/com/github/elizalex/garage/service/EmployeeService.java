package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    void save(Employee employee);

    Employee get(int id);

    void delete(int id);
}

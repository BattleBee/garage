package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}

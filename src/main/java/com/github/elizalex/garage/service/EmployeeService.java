package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.entity.Employee;
import com.github.elizalex.garage.repository.CarRepository;
import com.github.elizalex.garage.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}

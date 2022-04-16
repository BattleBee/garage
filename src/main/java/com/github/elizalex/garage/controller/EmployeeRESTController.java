package com.github.elizalex.garage.controller;

import com.github.elizalex.garage.entity.Employee;
import com.github.elizalex.garage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAll();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.get(id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.delete(id);
        return "Employee with id = " + id + " was deleted";
    }


}




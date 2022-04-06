package com.github.elizalex.garage.repository;

import com.github.elizalex.garage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

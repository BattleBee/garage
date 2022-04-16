package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAll() {
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

    @Override
    public void save(Employee employee) {
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());

    }

    @Override
    public Employee get(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void delete(int id) {
        Query query = entityManager.createQuery("delete from Employee"
                + "were id = :employee_id"); // создаем  запрос на удаление по id (проверить)
        query.setParameter("employee_id", id); // этот id в параметрах
        query.executeUpdate(); // выполняем запрос

    }
}

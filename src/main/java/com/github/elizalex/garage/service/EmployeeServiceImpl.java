package com.github.elizalex.garage.service;

import com.github.elizalex.garage.dao.EmployeeDAO;
import com.github.elizalex.garage.entity.Employee;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }


    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);

    }

    @Override
    @Transactional
    public Employee get(int id) {
        return employeeDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}

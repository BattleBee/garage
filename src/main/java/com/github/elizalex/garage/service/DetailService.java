package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Detail;
import com.github.elizalex.garage.entity.Employee;
import com.github.elizalex.garage.repository.DetailRepository;
import com.github.elizalex.garage.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetailService {
    private final DetailRepository detailRepository;

    @Autowired
    public DetailService(DetailRepository detailRepository) {
        this.detailRepository = detailRepository;
    }

    public Detail findById(Long id) {
        return detailRepository.findById(id).orElse(null);
    }

    public List<Detail> findAllDetail() {
        return detailRepository.findAll();
    }

    public Detail saveEmployee(Detail detail) {
        return detailRepository.save(detail);
    }

    public void deleteById(Long id) {
        detailRepository.deleteById(id);
    }
}

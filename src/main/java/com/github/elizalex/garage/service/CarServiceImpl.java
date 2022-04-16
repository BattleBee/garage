package com.github.elizalex.garage.service;

import com.github.elizalex.garage.dao.CarDAO;
import com.github.elizalex.garage.entity.Car;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;


    @Override
    @Transactional
    public List<Car> getAll() {
        return carDAO.getAll();
    }


    @Override
    @Transactional
    public void save(Car car) {
        carDAO.save(car);

    }

    @Override
    @Transactional
    public Car get(int id) {
        return carDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        carDAO.delete(id);
    }
}

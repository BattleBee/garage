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
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }


    @Override
    @Transactional
    public void saveCar(Car car) {
        carDAO.saveCar(car);

    }

    @Override
    @Transactional
    public Car getCar(int id) {
        return carDAO.getCar(id);
    }

    @Override
    @Transactional
    public void deleteCar(int id) {
        carDAO.deleteCar(id);
    }
}

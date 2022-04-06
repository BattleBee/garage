package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteById(Long id) {
       carRepository.deleteById(id);
    }


}

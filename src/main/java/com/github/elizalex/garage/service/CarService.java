package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Car;

import javax.transaction.Transactional;
import java.util.List;

public interface CarService {

    List<Car> getAllCars();

     void saveCar(Car car);

     Car getCar(int id);

     void deleteCar(int id);
}

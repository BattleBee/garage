package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Car;

import java.util.List;

public interface CarDAO {

    List<Car> getAllCars();

     void saveCar(Car car);

     Car getCar(int id);

     void deleteCar(int id);

}

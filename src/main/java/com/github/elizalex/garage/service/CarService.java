package com.github.elizalex.garage.service;

import com.github.elizalex.garage.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> getAll();

     void save(Car car);

     Car get(int id);

     void delete(int id);
}

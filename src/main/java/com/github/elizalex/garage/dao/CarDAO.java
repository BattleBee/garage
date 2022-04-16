package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Car;

import java.util.List;

public interface CarDAO {

    List<Car> getAll();

     void save(Car car);

     Car get(int id);

     void delete(int id);

}

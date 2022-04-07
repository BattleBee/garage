package com.github.elizalex.garage.controller;


import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MyRESTController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> showAllCars() {
        return carService.getAllCars();
    }

//    @GetMapping("/cars/{id}")
//    public Car getCar(@PathVariable int id) {
//        Car car = carService.getCar
//    }
}

package com.github.elizalex.garage.controller;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarRESTController {

    @Autowired
    private CarService carService;

    @RequestMapping("/")
    public String showFirstView() {
        return "To show all cars try - http://localhost:8080/api/cars";
    }

    @GetMapping("/cars")
    public List<Car> showAllCars() {
        List<Car> allCars = carService.getAllCars();
        return allCars;
    }

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable int id) {
        Car car = carService.getCar(id);
        return car;
    }

    @PostMapping("/cars")
    public Car addNewCar(@RequestBody Car car) {
        carService.saveCar(car);
        return car;
    }

    @PutMapping("/cars")
    public Car updateCar(@RequestBody Car car) {
        carService.saveCar(car);
        return car;
    }

    @DeleteMapping("/cars/{id}")
    public String deleteCar(@PathVariable int id) {
        carService.deleteCar(id);
        return "Car with id = " + id + " was deleted";
    }

}

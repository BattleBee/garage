package com.github.elizalex.garage.controller;


import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")  // у трегулова 81 урок 4 минута -установили что url любой команты будет содержать "/api"
public class CarRESTController {

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

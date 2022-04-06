package com.github.elizalex.garage.controller;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String findAll(Model model) {
        List<Car> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "car-list";
    }

    @GetMapping("/car-create")
    public String createCarForm(Car car) {
        return "car-create";
    }

    @PostMapping
    public String createCar(Car car) {
        carService.saveCar(car);
        return "/redirect:/cars";

    }
}

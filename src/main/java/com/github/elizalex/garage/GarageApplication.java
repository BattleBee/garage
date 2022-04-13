package com.github.elizalex.garage;

import com.github.elizalex.garage.entity.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GarageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GarageApplication.class, args);
        System.out.println("http://localhost:8080/");
        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setColor("Red");


        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setColor("Black");

        System.out.println(car2.getBrand());

    }

}

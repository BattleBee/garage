package com.github.elizalex.garage;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.entity.Detail;
import com.github.elizalex.garage.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GarageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GarageApplication.class, args);
        Car bmv = new Car("BMV", "Черный", 2020, 10000);
        Car mers = new Car("Mercedes-Benz", "Синий", 2021, 5000);
        Employee vasya = new Employee("Василий", "Петров", 21, "Механик");
        Employee alexandr = new Employee("Александр", "Сидоров", 25, "Электрик");
        Employee ivan = new Employee("Иван", "Дроздов", 21, "Кузовщик");
        Detail battery = new Detail("Аккумулятор");
        Detail windshield = new Detail("Лобовое стекло");

        Actions.installDetail(bmv,windshield,ivan);
        Actions.installDetail(bmv,battery, alexandr);




    }

}

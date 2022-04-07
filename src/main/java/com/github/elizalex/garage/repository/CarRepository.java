package com.github.elizalex.garage.repository;


import com.github.elizalex.garage.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}


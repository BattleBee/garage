package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Car;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarDAOImpl implements CarDAO {

    private EntityManager entityManager;


    @Override
    public List<Car> getAllCars() {
        Session session = entityManager.unwrap(Session.class); // создаем сессию с БД
        Query query = session.createQuery("from Car", Car.class);
        List<Car> allCars = query.getResultList();
        return allCars;
    }


//    private final CarService carService;



//    @GetMapping("/car-create")
//    public String createCarForm(Car car) {
//        return "car-create";
//    }
//
//    @PostMapping("/car-create")
//    public String createCar(Car car) {
//        carService.saveCar(car);
//        return "redirect:/cars";
//
//    }
}

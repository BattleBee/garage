package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarDAOImpl implements CarDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Car> getAll() {
        Query query = entityManager.createQuery("from Car");
        return (List<Car>) query.getResultList();
    }

    @Override
    public void save(Car car) {
        Car newCar = entityManager.merge(car);
        car.setId(newCar.getId());
    }

    @Override
    public Car get(int id) {
        Car car = entityManager.find(Car.class, id);
        return car;
    }

    @Override
    public void delete(int id) {
        Query query = entityManager.createQuery("delete from Car"
                + "were id = :car_id"); // создаем  запрос на удаление по id (проверить)
        query.setParameter("car_id", id); // этот id в параметрах
        query.executeUpdate(); // выполняем запрос
    }

}

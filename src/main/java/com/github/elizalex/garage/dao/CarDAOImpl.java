package com.github.elizalex.garage.dao;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarDAOImpl implements CarDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Car> getAllCars() {
        Session session = entityManager.unwrap(Session.class); // создаем сессию с БД
        Query<Car> query = session.createQuery("from Car", Car.class);
        List<Car> allCars = query.getResultList();
        return allCars;
    }

    @Override
    public void saveCar(Car car) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(car);
    }

    @Override
    public Car getCar(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Car.class, id);
    }

    @Override
    public void deleteCar(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<Car> query = session.createQuery("delete from Car"
                + "were id = :car_id"); // проверить запрос
        query.setParameter("car_id", id);
        query.executeUpdate();
    }

}

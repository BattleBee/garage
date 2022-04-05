package com.github.elizalex.garage;

import com.github.elizalex.garage.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * получение объектов по заданным условиям при использовании HQL
 */
public class Test2 {

    public static void main(String[] args) {

       SessionFactory factory = new Configuration()
               .configure("application.properties")
               .addAnnotatedClass(Car.class) // добавлние класса с аннотациями в БД
                .buildSessionFactory();
       try {
           Session session = factory.getCurrentSession(); // подключение к БД
           session.beginTransaction();  // открыли транзакцию
           List<Car> cars = session.createQuery("from Car " +    // в скобках пишем имя класса
                   "were brand = 'bmv' AND mileage > 10000") // выводим все машины марки бмв  спробегом
                   .getResultList();

           for (Car c: cars)
               System.out.println(c);

           session.getTransaction().commit(); // конец транзакции

           System.out.println(" Done! "); // просто метка

       }
       finally {
           factory.close();
       }
    }

}

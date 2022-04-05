package com.github.elizalex.garage;

import com.github.elizalex.garage.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Меняем характеристики объекта в БД
 */

public class Test3 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("application.properties")
                .addAnnotatedClass(Car.class) // добавлние класса с аннотациями в БД
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession(); // подключение к БД
            session.beginTransaction();  // открыли транзакцию
//            Car car1 = session.get(Car.class, 1); // получаем объект по ключу
//                    car1.setColor("Green"); // задаем значение поля
            session.createQuery("update Car set color= 'black' + " +
                    "were brand = 'BMV'").executeUpdate();

            session.getTransaction().commit(); // конец транзакции

            System.out.println(" Done! "); // просто метка

        }
        finally {
            factory.close();
        }
    }

}

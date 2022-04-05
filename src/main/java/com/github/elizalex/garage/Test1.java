package com.github.elizalex.garage;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.entity.Detail;
import com.github.elizalex.garage.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Создание соединения с БД и добавление объектов в БД и получение по id
 * в try with resource  на случай exception
 * SessionFactory - фабрика по произодству сессий берет данные для сессии из properties файла
 */
public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("application.properties")
                .addAnnotatedClass(Car.class) // добавлние класса с аннотациями в БД
                // .addAnnotatedClass(Employee.class) попробовать добавить все сразу
                //.addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {  // инициализация SessionFactory
  // добавление объекта в БД
            Session session = factory.getCurrentSession(); // подключение к БД (обертка JDBC)
            Car bmv = new Car("BMV", "Черный", 2020, 10000);
            session.beginTransaction(); // открыли транзакцию
            session.save(bmv); // сохраняем объект в БД
            session.getTransaction().commit(); // подтверждаем действие  по сохранению и закрываем сессию
            System.out.println(" Done! "); // просто метка
            System.out.println(bmv);

// получение объекта из БД по id
            int xId = bmv.getId();
            session = factory.getCurrentSession(); // подключение к БД
            session.beginTransaction(); // открыли транзакцию
            Car bmw1 = session.get(Car.class, xId); // получили объект из БД
            session.getTransaction().commit(); // подтверждаем действие  по сохранению и закрываем сессию

            System.out.println(" Done! ");
            System.out.println(bmw1);
        }
    }
}

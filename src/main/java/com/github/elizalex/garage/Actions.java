package com.github.elizalex.garage;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.entity.Detail;
import com.github.elizalex.garage.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Actions {
    /**
     * Добавляет деталь в БД
     */
    public static void addDetail(Detail detail) {
        try (SessionFactory factory = new Configuration() //в try with resource  на случай exception
                .configure("application.properties")
                .addAnnotatedClass(Detail.class) // добавлние класса с аннотациями в БД
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession(); // подключение к БД (обертка JDBC)
            session.beginTransaction(); // открыли транзакцию
            session.save(detail); // сохраняем объект в БД
            session.getTransaction().commit(); // подтверждаем действие  по сохранению и закрываем сессию
            System.out.println("Деталь " + detail.getName() + " добавлена в БД!");
            System.out.println(detail);
        }
    }

    /**
     * Добавляет машину в БД
     */
    public static void addCar(Car car) {
        try (SessionFactory factory = new Configuration() //в try with resource  на случай exception
                .configure("application.properties")
                .addAnnotatedClass(Detail.class) // добавлние класса с аннотациями в БД
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession(); // подключение к БД (обертка JDBC)
            session.beginTransaction(); // открыли транзакцию
            session.save(car); // сохраняем объект в БД
            session.getTransaction().commit(); // подтверждаем действие  по сохранению и закрываем сессию
            System.out.println("Машина " + car.getBrand() + " добавлена в БД!");
            System.out.println(car);
        }
    }

    /**
     * Добавляет сотрудника в БД
     */
    public static void addEmployee(Employee employee) {
        try (SessionFactory factory = new Configuration() //в try with resource  на случай exception
                .configure("application.properties")
                .addAnnotatedClass(Detail.class) // добавлние класса с аннотациями в БД
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession(); // подключение к БД (обертка JDBC)
            session.beginTransaction(); // открыли транзакцию
            session.save(employee); // сохраняем объект в БД
            session.getTransaction().commit(); // подтверждаем действие  по сохранению и закрываем сессию
            System.out.println("Сотрудник " + employee.getName() + " добавлен в БД!");
            System.out.println(employee);
        }
    }

    /**
     *  устанавливаем деталь ( переделать под БД)
     */
    public static void installDetail(Car car, Detail detail, Employee employee) {
        detail.setInstallOn(car.getId());
        detail.setRemoveFrom(0);
        detail.setUsedBy(employee.getId());

    }


    /**
     * Снимаем деталь ( переделать под БД)
     * @param car
     * @param detail
     */
    public void removeDetail(Car car, Detail detail, Employee employee) {
        detail.setInstallOn(0);
        detail.setRemoveFrom(car.getId());
        detail.setUsedBy(employee.getId());
    }


}

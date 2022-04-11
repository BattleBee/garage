package com.github.elizalex.garage;

import com.github.elizalex.garage.entity.Car;
import com.github.elizalex.garage.entity.Detail;
import com.github.elizalex.garage.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Logic {

    @Autowired
    private EntityManager entityManager;


    public void addDetailToCar(Car car, Detail detail, Employee employee) {
        int detailId = detail.getId();
        int carId = car.getId();
        int employeeId = employee.getId();
        Query query = entityManager.createQuery("update details set installOn = :carId, "
                + "usedBy = :employeeId were detail_id = :detailId"); // создаем  запрос
        query.setParameter("detail_id", detailId);
        query.executeUpdate(); // выполняем запрос

    }

    public void removeDetailFromCar(Car car, Detail detail, Employee employee) {
        int detailId = detail.getId();
        int employeeId = employee.getId();
        Query query = entityManager.createQuery("update details set installOn = :null, "
                + "usedBy = :employeeId were id = :detailId");
        query.setParameter("detail_id", detailId);
        query.executeUpdate();

    }

    public String printCarWithDetail(Detail detail) {
        Car car = detail.getInstallOn();
        Employee employee = detail.getUsedBy();
        if (car == null) {
            return "Деталь находится на складе.";
        } else {
            String s1;
            if (employee != null) {
                s1 = " Деталь установил: " + employee.getName() + " " + employee.getSurname() + "." ;
            } else {
                s1 = " Нет сведений о работнике, установившем деталь.";
            }
            return  "Деталь установлена на: " + car.getColor() + " " + car.getBrand() + ". " + s1;
        }
    }
}

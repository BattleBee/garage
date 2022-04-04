package com.github.elizalex.garage.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private int age;
    @Column(name = "specialization")
    private String specialization;

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", age=" + age
                + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", specialization='" + specialization + '\''
                + '}';
    }

}



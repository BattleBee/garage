package com.github.elizalex.garage.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_surname")
    private String surname;

    @Column(name = "employee_age")
    private int age;

    @Column(name = "employee_specialization")
    private String specialization;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "installOn" )
    private List<Detail> detailsDone;


}
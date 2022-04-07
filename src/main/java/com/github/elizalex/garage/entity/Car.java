package com.github.elizalex.garage.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    @Column(name = "car_brand")
    private String brand;

    @Column(name = "car_color")
    private String color;

    @Column(name = "car_year")
    private int year;

    @Column(name = "car_mileage")
    private int mileage;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "usedBy" )
    private List<Detail> installed_detail;

}

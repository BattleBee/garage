package com.github.elizalex.garage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "color")
    private String color;
    @Column(name = "year")
    private int year;
    @Column(name = "mileage")
    private int mileage;

    public Car() {
    }

    public Car(String brand, String color, int year, int mileage) {
        this.year = year;
        this.mileage = mileage;
        this.brand = brand;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{"
                + "id=" + id
                + ", year=" + year
                + ", mileage=" + mileage
                + ", brand='" + brand + '\''
                + ", color='" + color + '\''
                + '}';
    }
}

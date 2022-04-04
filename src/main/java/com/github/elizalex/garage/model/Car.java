package com.github.elizalex.garage.model;

public class Car {
    private int id;
    private int year;
    private int mileage;
    private String brand;
    private String color;

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

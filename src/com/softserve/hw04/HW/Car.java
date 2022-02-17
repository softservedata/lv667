package com.softserve.hw04.HW;

public class Car {
    private int yearProduction;
    private final double engineCapacity;

    public Car(int yearProduction, double engineCapacity) {
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public void display() {
        System.out.println(yearProduction+" year of production, engine capacity: " +engineCapacity);
    }
}

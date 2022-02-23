package com.softserve.hw05.PT_01;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void run() {
        System.out.println("\r\nTruck model " + model + " of " + yearOfManufacture + " manufacture year runs with max speed: " + maxSpeed);

    }

    public void stop() {
        System.out.println("Truck model " + model + " of " + yearOfManufacture + " manufacture year is stopped");
    }
}

package com.softserve.hw05.PT_01;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void run() {
        System.out.println("\r\nSedan model " + model + " of " + yearOfManufacture + "manufacture year runs with max speed: " + maxSpeed);
    }

    public void stop() {
        System.out.println("Sedan model " + model + " of " + yearOfManufacture + "manufacture year is stopped");
    }
}

package com.softserve.edu.hw7.passengers;

public class Car extends GroundVehicle{
    private String model;

    public Car(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}

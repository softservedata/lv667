package com.softserve.edu_09.task2;

public class Car extends GroundVehicle{
    private String model;

    public void drive(){

    }
    public Car(int passengers) {
        super(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

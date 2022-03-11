package com.softserve.edu_09.task2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public void drive(){

    }
    public Motorcycle(int passengers) {
        super(passengers);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

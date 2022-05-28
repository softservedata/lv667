package com.softserve.edu.hw7.passengers;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(){

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("Motorcycle is driving!");
    }
}

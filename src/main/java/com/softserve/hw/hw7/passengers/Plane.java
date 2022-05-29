package com.softserve.hw.hw7.passengers;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(){

    }

    public int getMaxDistance() {return maxDistance;}
    public void setMaxDistance(int maxDistance) {this.maxDistance = maxDistance;}

    @Override
    void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    void land() {
        System.out.println("Plane is landing");
    }
}

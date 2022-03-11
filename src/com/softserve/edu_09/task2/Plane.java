package com.softserve.edu_09.task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public void fly(){

    }
    public void land(){

    }

    public Plane(int passengers) {
        super(passengers);
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}

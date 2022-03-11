package com.softserve.edu_09.task2;

public class Liner extends WaterVehicle{
    private int floors;

    public void isSailing(){

    }

    public Liner(int passengers) {
        super(passengers);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

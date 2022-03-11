package com.softserve.edu_09.task2;

public class Bus extends GroundVehicle{
    private String route;

    public void drive(){

    }

    public Bus(int passengers) {
        super(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}

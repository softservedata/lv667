package com.softserve.hw.hw7.passengers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Passenger> list = new ArrayList<>();
        Collections.addAll(list,
                new Liner(),
                new Boat(),
                new Plane(),
                new Helicopter(),
                new Bus(),
                new Motorcycle(),
                new Car());

        list.forEach(elem -> {
            if(elem instanceof WaterVehicle){
                ((WaterVehicle) elem).isSailling();
            }else if(elem instanceof FlyingVehicle){
                ((FlyingVehicle) elem).fly();
                ((FlyingVehicle) elem).land();
            }else if(elem instanceof GroundVehicle){
                ((GroundVehicle) elem).drive();
            }
        });
    }
}
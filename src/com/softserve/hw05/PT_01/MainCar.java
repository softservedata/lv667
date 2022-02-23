package com.softserve.hw05.PT_01;

public class MainCar {
    public static void main(String[] args) {
        Car car[] = new Car[4];
        car[0] = new Sedan("FORD Fusion",160,2011);
        car[1] = new Sedan("Toyota Camry",180,2014);
        car[2] = new Truck("Opel Bedford Blitz",150,1985);
        car[3] = new Truck("Volkswagen Constellation",130,2005);
        for (int i = 0; i < car.length; i++) {
            car[i].run();
            car[i].stop();
        }
    }
}

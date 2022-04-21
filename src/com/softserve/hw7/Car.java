package com.softserve.hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Car implements Comparable<Car> {

    String type;
    float engineCapacity;
    int yearOfProduction;

    public Car(String type, float engineCapacity, int yearOfProduction) {
        this.type = type;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

        public void printDetails() {
        System.out.println(type + " - " + engineCapacity + ", " + yearOfProduction + ".");
    }

    @Override
    public int compareTo(Car car) {
        if (yearOfProduction == car.yearOfProduction)
            return 0;
        else if (yearOfProduction > car.yearOfProduction)
            return 1;
        else
            return -1;
    }
}


class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Camaro", 617, 2009));
        cars.add(new Car("Honda", 508.3F, 2021));
        cars.add(new Car("Corvette", 6161, 2019));
        cars.add(new Car("Tesla", 615.76F, 2022));

        for (Car car : cars)
            car.printDetails();

        System.out.println();

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.type + " - " + car.engineCapacity
                    + ", " + car.yearOfProduction + ".");
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int year = 0;
        while (true) {
            System.out.print("Enter selected year of production (2009, 2021, 2019, 2022): ");
            year = scanner.nextInt();
            if (year == 2009) {
                System.out.println("Camaro - 617.0, 2009.");
                return;}
            else if (year == 2021) {
                System.out.println("Honda - 508.3, 2021.");
                return;}
            else if (year == 2019) {
                System.out.println("Corvette - 6161.0, 2019.");
                return;}
            else if (year == 2022) {
                System.out.println("Tesla - 615.76, 2022.");
                return;}
        }
    }
}


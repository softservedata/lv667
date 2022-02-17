package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    //Create class Car with fields type, year of production and engine capacity.
    // Create and initialize four instances of class Car.
    // Display cars certain model year  (enter year in the console);
    //ordered by the field year.

    private String type;
    private int year;
    private int power;

    public Car(String type, int year, int power) {
        this.type = type;
        if (validateYear(year)) {
            this.year = year;
        }
        if (validatePower(power)) {
            this.power = power;
        }

    }

    private boolean validateYear(int year) {
        if (year < 1970 | year > 2022) {
            throw new IllegalArgumentException("Cars can`t be producted at this year ");
        }
        return true;

    }

    private boolean validatePower(int power) {
        if (power < 0 | power > 1000) {
            throw new IllegalArgumentException("Cars can`t so much power/or not enought power ");
        }
        return true;

    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", power=" + power +
                '}';
    }


    public static void main(String[] args) {
        Car car1 = new Car("Jeep", 1998, 175);
        Car car2 = new Car("Truck", 2002, 653);
        Car car3 = new Car("Golf car", 1998, 60);
        Car car4 = new Car("Minivan", 2011, 210);

        int[] arrCar = {car1.year, car2.year, car3.year, car4.year};
        Arrays.sort(arrCar);
        System.out.println(Arrays.toString(arrCar));

        boolean b = true;
        int a = 0;
        Scanner s = new Scanner(System.in);
        while (b) {
            System.out.println("Enter year of the car ");
            a = Integer.parseInt(s.nextLine());
            if (a == car1.year) {
                System.out.println(car1.toString());
                b = false;
            }
            if (a == car2.year) {
                System.out.println(car2.toString());
                b = false;
            }
            if (a == car3.year) {
                System.out.println(car3.toString());
                b = false;
            }
            if (a == car4.year) {
                System.out.println(car4.toString());
                b = false;
            }

        }
        s.close();
    }

}

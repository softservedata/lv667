/*
Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.
*/
package com.softserve.edu_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter car parameters:");
        Car car1 = new Car(Integer.parseInt(bufferedReader.readLine()), 5.8, "BMW");
        System.out.println("Enter car parameters:");
        Car car2 = new Car(Integer.parseInt(bufferedReader.readLine()), 4.2, "Nissan");
        System.out.println("Enter car parameters:");
        Car car3 = new Car(Integer.parseInt(bufferedReader.readLine()), 2.8, "Mazda");
        System.out.println("Enter car parameters:");
        Car car4 = new Car(Integer.parseInt(bufferedReader.readLine()), 8.8, "Jon deer");

        Car[] cars = new Car[]{car1, car2, car3, car4};
        Car car;
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() < cars[j].getYearOfProduction()) {
                    car = cars[i];
                    cars[i] = cars[j];
                    cars[j] = car;

                }
            }
        }
            System.out.println(Arrays.toString(cars));
    }
}

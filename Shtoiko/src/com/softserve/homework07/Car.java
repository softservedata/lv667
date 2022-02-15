package com.softserve.homework07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Car {
    static List<Car> cars = new ArrayList<>(4);
    private final int productYear;
    private final int engineCapacity;

    public Car(int productYear, int engineCapacity) {
        this.productYear = productYear;
        this.engineCapacity = engineCapacity;
        cars.add(this);
    }

    public static void searchByYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year for searching");
        int year = scanner.nextInt();
        List<Car> result = new ArrayList<>(cars.size());
        for (Car element : cars) {
            if (element.getProductYear() == year) {
                result.add(element);
            }
        }
        System.out.println("Cars with " + year + " year of production: ");
        for (Car element : result) {
            System.out.println(element);
        }
    }

    public static void orderedByYear() {
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getProductYear() == o2.getProductYear()) {
                    return 0;
                }
                if (o1.getProductYear() > o2.getProductYear()) {
                    return 1;
                }
                return -1;
            }
        });
        System.out.println("Sorted by year result:");
        for (Car element : cars) {
            System.out.println(element);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "productYear=" + productYear +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public int getProductYear() {
        return productYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getProductYear() == car.getProductYear() && engineCapacity == car.engineCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductYear(), engineCapacity);
    }
}

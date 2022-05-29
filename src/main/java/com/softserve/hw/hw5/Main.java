package com.softserve.hw.hw5;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task 1: Ask user to enter the number of month. Read the value and write the amount of days in this month
        NumberOfMonth obj = new NumberOfMonth();
        obj.getDysInMonth();
        System.out.println(obj.getMonthAndDys());
        System.out.println("-------------------------------------------");

        //Task 2: Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
        FirstFive obj2 = new FirstFive(10);
        obj2.setArrayOfNumbers();
        System.out.println(Arrays.toString(obj2.getArrayOfNumbers()));
        obj2.sumOrProduct();
        System.out.println("-------------------------------------------");

        /*
        * Task 3: Enter 5 integer numbers. Find:
        *   position of second positive number;
        *   minimum and its position in the array.
        * Organize entering integers until the first negative number. Count the product of all entered even numbers.
         * */
        CustomArray obj3 = new CustomArray();
        System.out.println(obj3.getArray());
        obj3.getSecondPositive();
        obj3.getMin();
        obj3.getProductEvenNumbers();
        System.out.println("-------------------------------------------");
        /*
        * Create class Car with fields type, year of production and engine capacity.
        * Create and initialize four instances of class Car.
        * Display cars:
            - certain model year  (enter year in the console);
            - ordered by the field year.
        * */

        ArrayList<Car> list = new ArrayList<Car>();
        Collections.addAll(list,
                new Car(2019, 2979 ,"BMW 2-SERIES M235I COUPE"),
                new Car(2011, 1598 ,"LANCIA DELTA GOLD 5 DOOR HATCHBACK"),
                new Car(2019, 3500 ,"RANGE ROVER EVOQUE DYNAMIC SUV"),
                new Car(2017, 2979 ,"MASERATI QUATTROPORTE S SEDAN"),
                new Car(2017, 1500 ,"DS 7 Crossback"),
                new Car(1984, 1500 ,"Renault 5 Turbo"),
                new Car(2019, 2500 ,"Skoda Superb")
        );

        // Display ordered by the field year.
        Collections.sort(list);
        for(Car elem:list){
            System.out.println(elem.toString());
        }

        // Display certain model year  (enter year in the console)
        Garage cars = new Garage();
        cars.parkToGarage(list);

        for(Car model :cars.filterCars()){
            System.out.println(model);
        }
    }
}

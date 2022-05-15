package com.softserve.edu.hw_ArraysLoops;

import java.util.Scanner;

public class Car implements Comparable{
    private String brand;
    private String model;
    private int year;
    private int capacity;

    public Car() {
        this.brand = "LADA";
        this.model = "2101";
        this.year = 1982;
        this.capacity = 1300;
    }

    public Car(String brand, String model, int year, int capacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
    }

    public String getName() {
        return brand + " " + model;
    }
    public void setName(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void input(){
        Scanner cin = new Scanner(System.in);

        System.out.print("Brand   : ");
        this.brand = cin.nextLine();

        System.out.print("Model   : ");
        this.model = cin.nextLine();

        System.out.print("Year    : ");
        this.year = Integer.parseInt(cin.nextLine());

        System.out.print("Capacity: ");
        this.capacity = Integer.parseInt(cin.nextLine());
    }
    public void output(){
        System.out.println(getName() + " - " + year);
        System.out.println(capacity + " TDI\n");
    }

    @Override
    public int compareTo(Object obj) {
        Car tmp = (Car)obj;
        if(this.year < tmp.year) {
            return -1;
        }

        else if(this.year > tmp.year) {
            return 1;
        }

        return 0;
    }
}

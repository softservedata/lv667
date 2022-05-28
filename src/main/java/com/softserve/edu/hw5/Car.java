package com.softserve.edu.hw5;

public class Car implements Comparable<Car>{
    private int year;
    private int capacity;
    private String type;

    //Setters-Getters
    public int getYear() {return year;}
    public int getCapacity() { return capacity;}
    public String getType() {return type;}
    public void setType(String type) { this.type = type;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public void setYear(int year) {this.year = year;}

    //Constructor
    public Car(int year,int capacity,String type){
        setCapacity(capacity);
        setType(type);
        setYear(year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return car.getYear()-getYear();
    }
}

package com.softserve.edu.HW2.practical;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int count = 1;
    public static int totalSum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getCount(){
        return count;
    }

    public Employee() {
        name = "Olaf";
        rate = 10;
        hours = 9;
        count++;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        count++;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        count++;
    }

    public int getSalary(int rate, int hours) {
        return rate * hours;
    }

    public double getBonuses() {
        return (double) getSalary(rate, hours) * 10 / 100;
    }

    public String toString() {
        System.out.println("Employee name:" + name + "\nRate:" + rate + "\nHours:" + hours + "\nSalary:" + getSalary(rate, hours) + "\nBonus(max10%):" + getBonuses());
        return null;
    }

    public int changeRate(int newRate) {
        setRate(newRate);
        getSalary(rate, hours);
        return newRate;
    }
}

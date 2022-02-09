package com.softserve.hw02.Employee;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    public static int totalSum;

    public Employee() {
        name = "Mary";
        rate = 8;
        hours = 5;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary(int rate, int hours) {
        return rate * hours;
    }

    public int changeRate(int newRate) {
        setRate(newRate);
        getSalary(rate, hours);
        return newRate;
    }

    public double getBonuses() {
        return (double) getSalary(rate, hours) * 10 / 100;
    }

    public String toString() {
        return "Employee \n\rName: " + name + "\n\rRate: " + rate + "\n\rWorked hours: " + hours
                + "\n\rSalary: " + getSalary(rate, hours) + "\n\rBonuses 10%: " + getBonuses();
    }

}

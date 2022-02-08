package com.softserve.homework05.practical;

import java.util.ArrayList;

public class Employee {
    private static int totalSum = 0;
    private static ArrayList<Employee> employeeList = new ArrayList<>(3);
    private String name;
    private int rate;
    private int hours;

    public Employee() {
        employeeList.add(this);
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        employeeList.add(this);
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        employeeList.add(this);
    }

    public static int getTotalSum() {
        for (Employee employee : employeeList) {
            totalSum += employee.getSalary();
        }
        return totalSum;
    }

    public static ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public int getSalary() {
        int salary = rate * hours;
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getBonuses() {
        return (float) getSalary() * 10 / 100;
    }

    @Override
    public String toString() {
        return "Name: " + name + " rate: " + rate + " hours: " + hours;
    }
}
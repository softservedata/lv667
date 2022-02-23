package com.softserve.hw04.PT;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", department number: " + departmentNumber + ", Salary: " + salary);
    }

}





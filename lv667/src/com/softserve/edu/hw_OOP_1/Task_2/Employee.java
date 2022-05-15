package com.softserve.edu.hw_OOP_1.Task_2;

public class Employee {
    private String name;
    private int age;
    private double salary;
    
    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String report(){
        String format = String.format("Name : %s, Age: %d, Salary: \u20B4 %1f.",
                name, age, salary);
        return format;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

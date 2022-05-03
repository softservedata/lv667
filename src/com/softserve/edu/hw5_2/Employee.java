package com.softserve.edu.hw5_2;

public class Employee {
    private int age;
    private String name;
    private double sallary;


    public Employee(int age, String name, double sallary) {
        setAge(age);
        setName(name);
        setSallary(sallary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = validateAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = validateSallary(sallary);
    }

    public int validateAge(int age) {
        if (age < 18 | age > 60) {
            throw new IllegalArgumentException("Age must be in range of [18;60]");
        }
        return age;
    }

    public double validateSallary(double sallary) {
        if (sallary < 5500) {
            throw new IllegalArgumentException("Minimal sallary in Ukraine is 5500 ");
        }
        return sallary;
    }

    public String report() {
        return String.format("Name: %s; Age: %d, Sallary: \u20B4 %.2f.", name, age, sallary);
    }
}

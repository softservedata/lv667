package com.softserve.hw05.HW_02;

public class Developer extends Employee {
    private int level;

    public Developer(String name, int age, double salary, int level) {
        super(name, age, salary);
        this.level = level;
    }

    @Override
    public String report() {

        return String.format("Name: " + getName() + ", age: " + getAge() + ", salary: " + getSalary() + " level: " + level);
    }

}

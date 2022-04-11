package com.softserve.edu.hw_OOP_1.Task_2;

public class Developer extends Employee{

    private  String position;

    public Developer(String name, String position,int age, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public String report(){
        String format = String.format("Name : %s, Position : %s, Age: %d, Salary: \u20B4 %1f.",
                super.getName(), position, super.getAge(), super.getSalary());
        return format;
    }
}

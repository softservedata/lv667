package com.softserve.edu.hw6.employee;

public class Employee {
    private String name;
    private Integer age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, Integer age, Double salary){
        setAge(age);
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String report() {
        return String.format("Name: %s , Age: %d, Salary: \u0024 %.2f",
                name, age, salary);
    }
}

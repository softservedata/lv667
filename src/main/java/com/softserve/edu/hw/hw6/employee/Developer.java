package com.softserve.edu.hw.hw6.employee;

public class Developer extends Employee{
    private String position;
    public Developer(String name, Integer age, Double salary, String position) {
        super(name, age, salary);
        setPosition(position);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s , Age: %d, Salary: \u0024 %.2f, Position: %s",
                    super.getName(), super.getAge(), super.getSalary(), getPosition());
    }
}
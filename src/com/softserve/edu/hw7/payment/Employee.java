package com.softserve.edu.hw7.payment;

public class Employee {
    private String employeeld;

    public Employee(String employeeld){
        setEmployeeld(employeeld);
    }

    public String getEmployeeld() {return employeeld;}
    public void setEmployeeld(String employeeld) {this.employeeld = employeeld;}

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                '}';
    }
}

package com.softserve.edu.hw_OOP_2.Task_1;

public class Employee implements Comparable<Employee>{
    private String employeeId;
    private int salary;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void   setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getInfo(){

    }

    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }
}

package com.softserve.edu.hw7.payment;

import java.util.Comparator;

public class Employee {
    private String employeeld;
    private double monthlySalary;

    public Employee(String employeeld){
        setEmployeeld(employeeld);
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getEmployeeld() {return employeeld;}
    public void setEmployeeld(String employeeld) {this.employeeld = employeeld;}
    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld='" + employeeld + '\'' +
                '}';
    }

    public static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee t1, Employee t2) {
            return (int)(t2.getMonthlySalary()-t1.getMonthlySalary());
        }
    }
}

package com.softserve.hw02.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Tom", 6, 10);
        Employee employeeTwo = new Employee("Mary", 9, 25);
        Employee employeeThree = new Employee("Jerry", 7, 4);

        Employee[] employees = {employeeOne, employeeTwo, employeeThree};
        for (Employee e : employees) {
            System.out.println(e.toString());
            Employee.totalSum += e.getSalary(e.getRate(), e.getHours());
        }
        System.out.println("Total Salary of all employees: " + Employee.totalSum);

    }
}
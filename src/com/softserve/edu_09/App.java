package com.softserve.edu_09;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees [0] = new SalariedEmployee(25, 480, "Normal");
        employees [1] = new ContractEmployee(10000, 0.9);
        employees [2] = new SalariedEmployee(28, 400, "Low");
        employees [3] = new ContractEmployee(25060, 0.7);
        employees [4] = new SalariedEmployee(20, 580, "Normal");
        Employee employee;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() < employees[j].calculatePay()) {
                    employee = employees[i];
                    employees[i] = employees[j];
                    employees[j] = employee;

                }
            }
        }
        System.out.println(Arrays.toString(employees));
    }
}

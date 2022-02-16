package com.softserve.hw04.PT;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Department number: " + departmentNumber);
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employeeArray[] = new Employee[5];
        employeeArray[0] = new Employee("Emma Watson", 20, 5200);
        employeeArray[1] = new Employee("Mary Clinton", 5, 4500);
        employeeArray[2] = new Employee("Tom Washington", 20, 6800);
        employeeArray[3] = new Employee("Victor Spielberg", 5, 4200);
        employeeArray[4] = new Employee("Clark Wills", 5, 5000);

        System.out.print("Enter department number: ");
        int dpNumber = sc.nextInt();
        int count = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (dpNumber == employeeArray[i].departmentNumber) {
                System.out.println("");
                count++;
                employeeArray[i].display();
            }
        }
        if (count == 0) {
            System.out.println("There is no employee in department #" + dpNumber);
        }
        int tmp;
        for (int i = 0; i < employeeArray.length - 1; i++) {
            for (int j = i + 1; j < employeeArray.length; j++) {
                if (employeeArray[i].salary < employeeArray[j].salary) {
                    tmp = employeeArray[i].salary;
                    employeeArray[i].salary = employeeArray[j].salary;
                    employeeArray[j].salary = tmp;
                }
            }
        }
        System.out.println("\r\nWorkers by the field salary in descending order:");
        for (int i = 0; i < employeeArray.length; i++) {
            employeeArray[i].display();
        }
    }

}



package com.softserve.hw05.HW_02;

public class MainEmployee {
    public static void main(String[] args) {
        Employee [] employees = new Employee[2];
        employees[0]=new Employee("Ivan",22,4523.33);
        employees[1]=new Developer("Mary",20,5132.742,2);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].report());
        }
    }
}

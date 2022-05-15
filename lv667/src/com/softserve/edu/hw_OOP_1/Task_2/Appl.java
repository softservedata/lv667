package com.softserve.edu.hw_OOP_1.Task_2;

public class Appl {
    public static void main(String[] args) {
        Employee empl = new Employee("Petrovych", 53, 800);
        Developer dev = new Developer("Sun Petrovycha", "Full stack java developer", 24, 3000);

        System.out.println(empl.report());
        System.out.println(dev.report());
    }
}

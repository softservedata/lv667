package com.softserve.homework08;

public class Main {
    public static void main(String[] args) {
        Employee driver = new Employee("Bernard", 39, 3023.5);
        Employee java = new Deweloper("Taras", 32, 5703.9, "Average Java developer");

        System.out.println(driver.report());
        System.out.println(java.report());

    }
}

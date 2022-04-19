package com.softserve.edu.hw_Nested_Inner_clases.Task_1;

public class Appl {
    public static void main(String[] args) {
        Student bob = new Student(19, new FullName("Bob", "Reminghton"), 2);
        Student tom = new Student(22, new FullName("Tom", "Harty"), 5);

        bob.info();
        bob.activity();

        tom.info();
        tom.activity();
    }
}

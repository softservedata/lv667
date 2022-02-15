package com.softserve.edu.hm3;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input();
        p1.output();
        p1.changeName("Oleg");
        p1.output();
        p1.changeName("Batman", "Origin");
        p1.output();
    }
}

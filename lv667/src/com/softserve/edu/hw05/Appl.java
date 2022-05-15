package com.softserve.edu.hw05;

import com.softserve.edu.hw05.Person;

public class Appl {

    public static void main(String[] args) {

        Person Ivan = new Person("Ivan" , "Petrovych"); Ivan.setBirthYear(1978);
        Person Petro = new Person("Petro" , "Romanovych"); Petro.setBirthYear(1987);
        Person Vasyl = new Person("Vasyl" , "Danylovych"); Vasyl.setBirthYear(1991);
        Person Mark = new Person("Mark" , "Zuckerberg"); Mark.setBirthYear(1980);
        Person iPerson = new Person();

        iPerson.input();

        Ivan.output();
        Petro.output();
        Vasyl.output();
        Mark.output();
        iPerson.output();
    }
}

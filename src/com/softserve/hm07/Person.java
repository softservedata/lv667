package com.softserve.hm07;

public class Person {
    private int birthYear;

    public Person(String rufat) {
    }

    public Person() {

    }

    public static void main(String[] args) {
        Person person1 = new Person("Rufat");
        person1.birthYear = 1994;
        System.out.println(person1);
        System.out.println("");

        System.out.println("First person is " + person1.getAge() + " old");
        person1.setFirstName("Andrey");
        person1.setLastName("Ivanec");
        person1.birthYear = 1990;
        System.out.println(person1);
        System.out.println();

        Person person2 = new Person();
        System.out.println("Second person is " + person2.getAge() + " old");
        boolean Person = false;
        System.out.println(Person);
        System.out.println();

        Person person3 = new Person("Igor");
        person3.birthYear = 1964;
        System.out.println("Person3 is " + person3.getAge() + " old");
        System.out.println(person3);
    }

    private void setLastName(String Ivanec) {
    }

    private void setFirstName(String Andrey) {
    }

    private String getAge() {
        return null;
    }
}



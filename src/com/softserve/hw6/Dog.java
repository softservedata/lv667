package com.softserve.hw6;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Dog {
    public Dog(String name, Breed s, int age) {
        this.name = name;
        this.s = s;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getS() {
        return s;
    }

    public void setS(Breed s) {
        this.s = s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String output() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", s=" + s +
                ", age=" + age +
                '}';
    }

    enum Breed {
        AKITA("akita"),
        BEAGLE("beagle"),
        COLLIE("collie"),
        MALTESE("maltese"),
        MASTIFF("mastiff");

        private final String name;

        private Breed(String s) {//приватный конструктор
            name = s;
        }

        public String getValue() {//метод для получения значения
            return name;
        }

    }


    private String name;
    private Breed s;
    private int age;

    public Dog() {
        this.name = name;
        this.s = s;
        this.age = age;
    }

    static Dog input() {
        Scanner scan = new Scanner(System.in);
        Dog p = new Dog();
        System.out.print("Dog's name: ");
        p.setName (scan.next());
        System.out.print("Dog's age: ");
        p.setAge(Integer.parseInt(scan.next()));
        for (Breed brd : Breed.values())
            System.out.println(brd);
        while (true)

            try {
                System.out.print("Dog breed: ");
                System.out.println("YOUR DOG'S BREED IS " + Breed.valueOf(scan.next()));
                return p;
            } catch (IllegalArgumentException m) {
                System.out.println("  Error: " + m);
            }

    }

}

class Main1 {
    public static void main(String[] args) {
        Dog[] animal = new Dog[4];
        for (int i = 0; i < 4; i++) {
            animal[i] = Dog.input();
        }

        for (Dog animal1 : animal) {
            System.out.println(animal1.output());
        }
    }

}

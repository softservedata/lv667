package com.softserve.edu_10;

public class Main {
    public static void main(String[] args) {
        FullName person1 = new FullName("Herb", "Alegovich");
        Student student1 = new Student(person1, 18, 2);
        System.out.println(student1.activity());
        System.out.println(student1.info());

        FullName person2 = new FullName("Gabe", "Hiden");
        Student student2 = new Student(person2, 18, 2);
        System.out.println(student2.activity());
        System.out.println(student2.info());
    }
}

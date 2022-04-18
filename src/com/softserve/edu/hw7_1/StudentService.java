package com.softserve.edu.hw7_1;

import com.softserve.edu.hw6.Employee;

import java.util.Arrays;

public class StudentService {

    private final static Person[] ARRAY_STUDENT = new Person[]{
            new Student("Yura", "Heto", 26, 6),
            new Student("Taras", "Katar", 21, 4),
            new Student("Tanya", "Dubrova", 18, 2),
            new Student("Tanya", "Dubrova", 17, 3),
            new Student("Yura", "Heto", 19, 1)};


    public void run1() {
        for (Person s : ARRAY_STUDENT) {
            System.out.println(s.info());
            System.out.println(s.activity());
            System.out.println("///////////////////////////");
        }
    }

    private void print(Object[] array) {
        for (Object obj : array) {
            System.out.println(obj);
        }
    }

    public void run2() {
        System.out.println("Before sort");
        print(ARRAY_STUDENT);

        Arrays.sort(ARRAY_STUDENT, new Person.AgeSort());
        System.out.println("-----------------------------");
        System.out.println("After sort");
        print(ARRAY_STUDENT);

    }


}

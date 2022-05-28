package com.softserve.edu.hw9.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studList = new ArrayList<>();
        Collections.addAll(studList,
                new Student("Elizabeth Stuart",1001),
                new Student("Catherine Middleton",3201),
                new Student("Sarah Ferguson",1042),
                new Student("Sophie Rhys-Jones",9121),
                new Student("Catherine Middleton",4411),
                new Student("Meghan Markle",1021),
                new Student("Mark Phillips",1021),
                new Student("Ernest Augustus",1001)
        );

        // get all students with a certain course id
        System.out.println("---- get all students with a certain course id ----------");
        Student.printStudents(studList, 1021);

        // sort students by name
        Collections.sort(studList, new Student.SortByName());
        System.out.println("---------------------- sort by name ----------------------");
        studList.forEach(System.out:: println);

        // sort students by name course id
        Collections.sort(studList, new Student.SortByCourse());
        System.out.println("---------------------- sort by course id -----------------");
        studList.forEach(System.out:: println);
    }
}

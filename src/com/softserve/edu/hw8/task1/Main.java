package com.softserve.edu.hw8.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> university = new ArrayList<>();
        Collections.addAll(university,
                new Student(12, new FullName("Zahar","Luciv"), 18),
                new Student(78, new FullName("Lubomir","Kurahiv"), 19),
                new Student(31, new FullName("Bertold","Vovk"), 17),
                new Student(112, new FullName("Anya","Kazarevich"), 16));

        System.out.println("-------------------------- Unsorted Collection ---------------------------------");
        // print all students and invoke info() and then activity() methods
        easyPrint(university);

        // sort by age
        System.out.println("\n-----------------SORTED BY AGE (by anonymous class) ---------------------------");
        Collections.sort(university, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });

        // print sorted collection
        easyPrint(university);

        // sort by courseId
        System.out.println("\n-----------------SORTED BY COURSE_ID (by static inner class)---------------------------");
        Collections.sort(university, new Student.SortByCourseID());

        // print sorted collection
        easyPrint(university);

        // sort by name
        System.out.println("\n-----------------SORTED BY NAME (by inner class)---------------------------");
        Collections.sort(university, new Student(). new SortByName());
        // print sorted collection
        easyPrint(university);
    }

    // method to print out elements of collection
    static <T> void easyPrint(List<T> params){
        params.forEach(elem -> {
            if(elem instanceof Student){
                System.out.println(String.format("student info -> %s, activity -> %s", ((Student)elem).info(),((Student)elem).activity()));
            }
        });

    }
}

package com.softserve.edu_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",2);
        Student st2 = new Student("001",1);
        Student st3 = new Student("002",3);
        Student st4 = new Student("003",5);
        Student st5 = new Student("004",4);
        List <Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println("\n Print students course ");
        Student.printStudent(students);
        System.out.println("\n Sorted by name ");
        Collections.sort(students, new SortByName());
        System.out.println(students);
        System.out.println("\n Sorted by course ");
        Collections.sort(students, new SortByCourse());
        System.out.println(students);
        System.out.println("\n Sorted by name and course ");
        Collections.sort(students, new SortByCourseAndName());
        System.out.println(students);
    }
}

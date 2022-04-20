package com.softserve.edu.hw8_3;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class StudentService {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student(1, "Ivan"));
        students.add(new Student(4, "Igor"));
        students.add(new Student(5, "Yura"));
        students.add(new Student(4, "Taras"));
        students.add(new Student(6, "Taras"));
        students.add(new Student(3, "Kolya"));
        students.add(new Student(6, "Oleh"));
        students.add(new Student(2, "Oleh"));
        students.add(new Student(3, "Oleh"));

        System.out.println("Print student before sort :\n" + students.toString());

        Collections.sort(students, new Student.ByNameAndCourse());
        System.out.println("Print student after sort ByNameAndCourse :\n" + students.toString());

        Collections.sort(students, new Student.byCourse());
        System.out.println("Print student after sort ByCourse :\n" + students.toString());

        Collections.sort(students);// byName from Comparable
        System.out.println("Print student after sort ByName :\n" + students.toString());


        Student.printStudents(students, 3);


    }


}

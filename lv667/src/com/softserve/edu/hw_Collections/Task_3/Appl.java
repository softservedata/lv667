package com.softserve.edu.hw_Collections.Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        ArrayList<Student> group = new ArrayList<>();

        group.add(new Student("Petro"    , 1));
        group.add(new Student("Ivan"     , 2));
        group.add(new Student("Vasyl"    , 1));
        group.add(new Student("Bogdan"   , 3));
        group.add(new Student("Danilo"   , 4));
        group.add(new Student("Vlad"     , 2));
        group.add(new Student("Dmytro"   , 3));
        group.add(new Student("Ivanka"   , 2));
        group.add(new Student("Mykola"   , 4));
        group.add(new Student("Taras"    , 2));

        System.out.println("\nOrdered by name");
        Collections.sort(group, new Student.ByName());
        System.out.println(group.toString());

        System.out.println("\nOrdered by course");
        Collections.sort(group, new Student.ByCourse());
        System.out.println(group.toString());
    }

    public static void printStudents(ArrayList<Student> stud, int course){
        Iterator<Student> it = stud.iterator();

        while (it.hasNext()){
            Student temp = it.next();
            if(temp.getCourse() == course){
                System.out.println("Name : \t" + temp.getName() + " \t| Course : \t" + temp.getCourse());
            }
        }
    }
}

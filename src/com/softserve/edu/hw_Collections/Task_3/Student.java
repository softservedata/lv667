package com.softserve.edu.hw_Collections.Task_3;

import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    @Override
    public String toString() {
        return "Name : \t" + name + " \t| Course : \t" + course + "\n";
    }

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse() - st2.getCourse();
        }
    }

    public static class ByCourseAndAge implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            int byName = st1.getName().compareTo(st2.getName());
            return byName == 0 ? st1.getCourse() - st2.getCourse() : byName;
        }
    }

    ///Fields///

    private String name;
    private int course;

    //Fields//



    ///Constructors///

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    //Constructors//



    ///Getters and Setters///

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //Getters and Setters//



    ///Methods///



    //Methods//

    /// Comparators ///

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    // Comparators //
}

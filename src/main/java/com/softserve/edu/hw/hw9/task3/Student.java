package com.softserve.edu.hw.hw9.task3;

import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;
    private Integer course;

    public Student(String name, Integer course){
        setName(name);
        setCourse(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static <T> void printStudents(List<T> students, Integer course){
        students.forEach(stud -> {
            if(((Student)stud).getCourse().equals(course)){
                System.out.println(((Student)stud).getName());
            }
        });
    }

    public static class SortByName implements Comparator<Student>{
        @Override
        public int compare(Student t1, Student t2) {
            return t1.getName().compareTo(t2.getName());
        }
    }

    public static class SortByCourse implements Comparator<Student>{
        @Override
        public int compare(Student t1, Student t2) {
            return t1.getCourse().compareTo(t2.getCourse());
        }
    }
}

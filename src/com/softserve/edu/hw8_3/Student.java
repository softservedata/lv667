package com.softserve.edu.hw8_3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    int course;
    String name;

    public static class ByNameAndCourse implements Comparator<Student> {

        @Override
        public int compare(Student st1, Student st2) {
            int byName = st1.getName().compareTo(st2.getName());
            return byName == 0 ? st1.getCourse() - st2.getCourse() : byName;
        }
    }

    public static class byCourse implements Comparator<Student> {

        @Override
        public int compare(Student st1, Student st2) {

            return st1.getCourse() - st2.getCourse();
        }
    }

    public Student(int course, String name) {
        setCourse(course);
        setName(name);
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student stud = iterator.next();
            if (stud.getCourse() == course) {
                System.out.println("Student at course " + course + " = " + stud.getName());
            }

        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 0 | course > 6) {
            throw new IllegalArgumentException(" Wrong course ");
        } else this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, name);
    }

    @Override
    public String toString() {
        return "Student {" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(Student st1) {
        return name.compareTo(st1.getName());
    }
}

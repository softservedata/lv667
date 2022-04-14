package com.softserve.edu_11;

import java.util.List;
import java.util.Scanner;

/*
Write class Student that provides information about the name of the student and his course. Class Student should consist of
а) properties for access to these fields
b) constructor with parameters
c) method printStudents (List students, Integer course), which receives a list of students and the course number
and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
d)methods to compare students by name and by course
e)In the main() method
- declare List students and add to the list five different students
- display the list of students ordered by name
- display the list of students ordered by course.
 */
public class Student {
    private String firstName;
    private int course;

    public Student(String firstName, int course) {
        this.firstName = firstName;
        this.course = course;
    }
    public String toString (){
        return this.firstName + " " + this.course;
    }

    public static void printStudent(List <Student> students) {
        Scanner sk = new Scanner(System.in);
        int courseOfStudent = sk.nextInt();
        for (int i = 0; i < students.size(); i++){
            if (courseOfStudent == students.get(i).getCourse()){
                System.out.println(students.get(i).getFirstName());
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

package com.softserve.edu.hw.hw8.task1;

import java.util.Comparator;

public class Student extends Person{

    public static class SortByCourseID implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getCourseId() - s2.getCourseId();
        }
    }

    public class SortByName implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getFullname().getFirstName().compareTo(s2.getFullname().getFirstName());
        }
    }


    // --------------
    private int courseId;

    public Student(int courseId, FullName fullName, int age){
        super(fullName, age);
        setCourseId(courseId);
    }

    public Student(){

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String info(){
        return String.format("First name: %s, Last name: %s, Age: %d, CourseID : %d", getFullname().getFirstName(), getFullname().getLastName(), getAge(), getCourseId());
    };

    @Override
    public String activity() {
        return "I study in university";
    }
}

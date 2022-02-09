package com.softserve.hw02.Student;

public class MainStudent {
    public static void main(String[] args) {
        int totalRating = 0;
        Student studentOne = new Student();
        Student studentTwo = new Student("Tom", 6);
        Student studentThree = new Student("Mary", 10);
        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);

        Student[] students = {studentOne, studentTwo, studentThree}; //array students: totalRating
        for (Student s : students) {
            totalRating += s.getRating();
        }
        Student.avgRating = (double) totalRating / students.length;
        System.out.println("Average rating: " + Student.avgRating + ", Total rating: " + totalRating);
    }
}

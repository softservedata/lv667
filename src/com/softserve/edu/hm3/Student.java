package com.softserve.edu.hm3;

public class Student {
    private String name;
    private double rating;
    public static double avgRating=0;
    public static double totalRatings=0;
    public static int studentsCnt=0;

    // getters and setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    // constructors
    Student(String name, double rating){
        setName(name);
        setRating(rating);
        studentsCnt+=1;
        totalRatings+=getRating();
        avgRating=totalRatings/studentsCnt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public boolean betterStudent(Student stud){
        return this.getRating()>stud.getRating();
    }
    public static void main(String[] args) {
        Student igor = new Student("Igor", 3.4);
        Student hanna = new Student("hanna", 4);
        Student ivan = new Student("Ivan", 4.8);

        // display information
        System.out.println(igor.toString());
        System.out.println(hanna.toString());
        System.out.println(ivan.toString());
        System.out.printf("the average rating of all students is:%.2f\n",Student.avgRating);
        System.out.println("hanna\'s rating better tha igor's:" + hanna.betterStudent(igor));
        System.out.printf("total rating of all students is:%.2f\n", Student.totalRatings);
    }

}

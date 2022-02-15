package com.softserve.edu.hm3;
import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public int getBirthYear() {return birthYear;}
    public void setBirthYear(int birthYear) {this.birthYear = birthYear;}

    Person(){
    }

    Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getAge(int birthYear){
        return (LocalDate.now().getYear()-getBirthYear());
    }

    public void output() {
        System.out.println( "firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", birthYear=" + getBirthYear() +
                ", age=" + getAge(getBirthYear()));
    }

    public void changeName(String fn, String ln){
        setLastName(ln);
        setFirstName(fn);
    }

    public void changeName(String fn){
        setFirstName(fn);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("type your First name:");
        setFirstName(sc.nextLine());
        System.out.print("\ntype your Last name:");
        setLastName(sc.nextLine());
        System.out.print("\ntype you date-of-birthday:");
        setBirthYear(Integer.parseInt(sc.nextLine()));
        sc.close();
    }

}

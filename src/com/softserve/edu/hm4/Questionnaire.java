package com.softserve.edu.hm4;
import java.util.Scanner;

public class Questionnaire {
    private String name;
    private String address;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void askPersonInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        setName(sc.nextLine());
        System.out.println("Where are you live, "+ getName() +"?");
        setAddress(sc.nextLine());
        sc.close();
    }
    @Override
    public String toString() {
        return "Questionnaire{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

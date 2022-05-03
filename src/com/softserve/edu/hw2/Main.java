package com.softserve.edu.hw2;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person("Yura","Petrenko");
        person1.birthYear=1998;
        System.out.println(person1);
        System.out.println("");

        System.out.println("First person is "+person1.getAge()+ " old");
        person1.setFirstName("Igor");
        person1.setLastName("Dorozhuk");
        System.out.println(person1);
        System.out.println();

        Person person2=new Person();
        System.out.println("Second person is "+person2.getAge()+ " old");
        System.out.println(person2);
        System.out.println();

        Person person3=new Person("Ivan","Vlasenko");
        person3.birthYear=1990;
        System.out.println("Person3 is "+person3.getAge()+" old");
        System.out.println(person3);
    }
}

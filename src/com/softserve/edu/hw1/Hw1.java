package com.softserve.edu.hw1;

import java.util.Objects;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        //Flower bed is shaped like a circle.
        // Calculate the perimeter and area by entering the radius.
        // Output obtained results

        int r = 20;

        double s, perimeter;
        perimeter = 2 * Math.PI * r;
        s = Math.PI * r * r;
        System.out.println("Периметр = " + String.format("%.2f", perimeter) + "\nПлоща = " + s);
        System.out.println("\n");

        Circle circle1 = new Circle(20);

        double perimeter1 = circle1.calculatePerimeter();
        System.out.println("Периметр = " + perimeter1);
        double area1 = circle1.calculateArea();
        System.out.println("Площа = " + area1);
        System.out.println();

        //Define String variables name and address.
        // Output question "What is your name?"
        // Read the value name and output next question: “Where are you live, (name)?".
        // Read address and write whole information.
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String s1 = sc.nextLine();
        System.out.println("Where are you live " + s1 + " ?");
        String s2 = sc.nextLine();
        System.out.println("Hello " + s1 + " from " + s2);
        System.out.println();
        String s3 = "pass";
        String s4;
        do {
            System.out.println("Enter a pasword " + s1);
            s4 = sc.nextLine();
        } while (!Objects.equals(s4, s3));
        System.out.println("Password is confirm");
        System.out.println();
//Phone calls from three different countries are с1, с2 and с3 standard units per minute.
// Talks continued t1, t2 and t3 minutes.
// How much computer will count for each call separately and all talk together?
// Input all source data from console, make calculations and output to the screen.
        Scanner sc2=new Scanner(System.in);
        double c11= 3.13;
        double c12= 4.1;
        double c13= 6.45;
        String s11 ="ukr" ;
        String s12 ="pol" ;
        String s13 ="bel" ;
        String s15;
        double t11,t12,t13;
        do{System.out.println("Enter from wich countrie was a call:" +s11+" , "+s12+" or "+s13+ "?");
        s15= sc2.nextLine();
        if(s15.equals(s11)){
            System.out.println("Enter how much time was a call ? ");
            t11= sc2.nextDouble();
            System.out.println("It coast = "+t11*c11);
            break;
        }else if(s15.equals(s12)){
            System.out.println("Enter how much time was a call ? ");
            t12= sc2.nextDouble();
            System.out.println("It coast = "+t12*c12);
            break;
        }else if(s15.equals(s13)){
            System.out.println("Enter how much time was a call ? ");
            t13= sc2.nextDouble();
            System.out.println("It coast = "+t13*c13);
            break;
        }

        }while (!Objects.equals(s15, s11) | !Objects.equals(s15, s12) | !Objects.equals(s15, s13));

    }
}





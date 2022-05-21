package com.softserve.edu.HW4;

import java.util.Scanner;
public class MainCar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] carArray = new Car[4];
        carArray[0] = new Car(2007, 1.4);
        carArray[1] = new Car(2003, 2.0);
        carArray[2] = new Car(2004, 1.0);
        carArray[3] = new Car(2010, 4.7);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        for (int i = 0; i < carArray.length; i++) {
            if (year == carArray[i].getYearProduction()) {
                carArray[i].display();
            }
        }

        for (int i = 0; i < carArray.length - 1; i++) {
            for (int j = 0; j < carArray.length; j++) {
                if (carArray[i].getYearProduction() < carArray[j].getYearProduction()) {
                    int tmp = carArray[i].getYearProduction();
                    carArray[i].setYearProduction(carArray[j].getYearProduction());
                    carArray[j].setYearProduction(tmp);
                }
            }

        }
        System.out.println("\r\nOrdered by the year: ");
        for (int i = 0; i < carArray.length; i++) {
            System.out.println("");
            carArray[i].display();
        }
    }
}

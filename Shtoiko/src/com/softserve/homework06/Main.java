package com.softserve.homework06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberQuantity = 3;
        float floats[] = new float[numberQuantity];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < floats.length; i++) {
            System.out.println("Input float №" + (i + 1));
            floats[i] = scanner.nextFloat();
        }

        for (int i = 0; i < floats.length; i++) {
            if (floats[i] >= -5 && floats[i] <= 5) {
                System.out.println("Number №" + (i + 1) + " belongs to the range -5 and 5");
            } else {
                System.out.println("Number №" + (i + 1) + " does not belong to the range -5 and 5");
            }
        }

        int httpError;
        System.out.println("Enter number of HTTP error.");
        httpError = scanner.nextInt();
        switch (httpError) {
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 402:
                System.out.println("Payment Required");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            default:
                System.out.println("Unknown error.");
        }

        Dog first = new Dog("Koko", Breed.MALINOIS, 17);
        Dog second = new Dog("Mike", Breed.BULLDOGS, 25);
        Dog third = new Dog("Dog", Breed.HUSKIES, 30);
        Dog fourth = new Dog("Cat", Breed.MASTIFF, 5);
        Dog fifth = new Dog("Uksus", Breed.LABRADOR, 15);
        Dog fifthClone = new Dog("Uksus", Breed.LABRADOR, 15);

        System.out.println("The oldest dog is " + Dog.getOldestDog());
        System.out.println(Dog.identicalNames());
    }
}

package com.softserve.edu.hw_Collections.Task_2;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();

        personMap.put("Petro", "Ivanovych");
        personMap.put("Boghdan", "Petrovych");
        personMap.put("Vasyl", "Boghdanovych");
        personMap.put("Ivan", "Ivanovych");
        personMap.put("Roman", "Volodymyrovych");
        personMap.put("Sergiy", "Romanovych");
        personMap.put("Mykhailo", "Sergiyovych");
        personMap.put("Voldya", "Mykhailovych");
        personMap.put("Orest", "Petrovych");
        personMap.put("Mykola", "Romanovych");

        System.out.println("Original :");
        System.out.println(personMap.toString());

        ArrayList firstName = new ArrayList(personMap.values());
        Collections.sort(firstName);


        for (int i = 0; i < firstName.size() - 1; i++) {
            if (firstName.get(i) == firstName.get(i + 1)) {
                System.out.println("\nThere are at less two persons with the same firstName\n");
                break;
            }
        }

        System.out.println("Remove Orest");
        personMap.remove("Orest");
        System.out.println(personMap.toString());
    }
}

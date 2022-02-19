package com.softserve.edu.hm4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Solution 1.1: read 3 float numbers and check: are they all belong to the range [-5,5];
        Belong obj2 = new Belong();
        obj2.inRange();
        System.out.println("------------------------------------");

        // Solution 1.2: read 3 integer numbers and write max and min of them;
        System.out.println("if you create an empty Class you will be asked to input numbers a, b and c");
        Minmax sample1 = new Minmax();
        sample1.minOfThree();
        sample1.maxOfThree();

        // Solution 1.3: Read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
        Scanner sc = new Scanner(System.in);
        System.out.println("input one of the error codes 400 / 403 / 404 / 405");
        int code = sc.nextInt();
        for(HTTPError err:HTTPError.values()){
            if(code == err.getError()){
                System.out.printf("code %s = %s",code, err.getErrorTitle());
            }
        }

        // Check if there is no two dogs with the same name
        List<Dog> list = new ArrayList<Dog>();
        Collections.addAll(list,
                new Dog("Chuky", 5,Breed.POODLE),
                new Dog("Rocky", 8,Breed.SHIBA_INU),
                new Dog("Henessy", 2,Breed.CANE_CORSO),
                new Dog("Robb", 2,Breed.CANE_CORSO),
                new Dog("Chuky", 2,Breed.CANE_CORSO));

        // solve the task by hard coding
        boolean hasNameDuplicates = true;
        for(int i=0; i<=list.size()-2; i++){
            for(int j=i+1; j<=list.size()-1; j++){
                if(list.get(j).getName() == list.get(i).getName()){
                    hasNameDuplicates = false;
                }
            }
        }
        System.out.printf("The Statement that there are no two dogs with the same name is %b",hasNameDuplicates);

        // Display the name and the kind of the oldest dog.
        int pos=0;
        int max=0;
        for(int i=0; i<list.size();i++){
            if(list.get(i).getAge()>max){
                max=list.get(i).getAge();
                pos=i;
            }
        }

        System.out.println("\nthe oldest Dog is: " + list.get(pos).toString());
    }
}

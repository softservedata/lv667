package com.softserve.edu_06;

public class DogApp {
    public static void main(String[] args) {

        Dog FirstDog = new Dog("Max", 7, Dog.Breed.German_Shepherd);
        Dog SecondDog = new Dog("Miki", 3, Dog.Breed.Husky);
        Dog ThirdDog = new Dog("Holmes", 4, Dog.Breed.Retriever);

        if (FirstDog.Name == SecondDog.Name) {
            System.out.println(" First dog have the same name Second dog");
        } else if (SecondDog.Name == ThirdDog.Name) {
            System.out.println(" Second dog have the same name Third dog ");
        } else {
            System.out.println(" there no dog with those name ");
        }


        if (FirstDog.Age > SecondDog.Age && FirstDog.Age > ThirdDog.Age) {
            System.out.println(FirstDog.Name + " " + FirstDog.breed);
        } else if (SecondDog.Age > FirstDog.Age && SecondDog.Age > ThirdDog.Age) {
            System.out.println(SecondDog.Name + " " + SecondDog.breed);
        } else {
            System.out.println(ThirdDog.Name + " " + ThirdDog.breed);
        }
    }
}

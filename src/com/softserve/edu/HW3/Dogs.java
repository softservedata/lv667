package com.softserve.edu.HW3;

public class Dogs {
    private final String name;
    private final Breed BreedName;
    private final int Age;

    Dogs(String setName, Breed setBreed, int setAge) {
        this.name = setName;
        this.BreedName = setBreed;
        this.Age = setAge;
    }

    public enum Breed {
        AKITA("Akita"),
        Huskies("Huskies"),
        German_Shepherd("Shepherd"),
        Labrador("Labrador");
        private final String namebeerd;
        Breed(String namebeerd) {
            this.namebeerd = namebeerd;
        }
        public String getTxtBreed() {
            return namebeerd;
        }
    }

    public void getFriend() {
        System.out.println("Name - " + this.name + "\nBreed - " + this.BreedName.getTxtBreed() + "\nAge - " + this.Age +"\n");
    }


    public static void main(String[] args) {
        Breed Akita = Breed.AKITA;
        Breed Huskies = Breed.Huskies;
        Breed Labrador = Breed.Labrador;
        Dogs friend1 = new Dogs("Tumbler", Akita, 3);
        Dogs friend2 = new Dogs("Spenser", Huskies, 1);
        Dogs friend3 = new Dogs("Loki", Labrador, 5);
        friend1.getFriend();
        friend2.getFriend();
        friend3.getFriend();
        System.out.println("Are there dogs with the same name?");
        System.out.print((friend1.name == friend2.name) || (friend3.name == friend2.name) || (friend1.name == friend3.name));
    }
}

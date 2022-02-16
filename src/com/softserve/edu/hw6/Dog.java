package com.softserve.edu.hw6;

public class Dog {
    private final String name;
    private final Breed BreedName;
    private final int Age;

    Dog(String setName, Breed setBreed, int setAge) {
        this.name = setName;
        this.BreedName = setBreed;
        this.Age = setAge;
    }

    public enum Breed {
        AKITA("Akita"), AUSTRALIAN_KELPIE("Australian Kelpie"), BEAGLE("Beagle"), PEMBROKE_WELSH_CORGI("Pembroke Welsh Corgi");
        private final String namebeerd;
        Breed(String namebeerd) {
            this.namebeerd = namebeerd;
        }
        public String getTxtBreed() { return namebeerd;}
    }

    public void getFriend() {
        System.out.println("Name - " + this.name + "\nBreed - " + this.BreedName.getTxtBreed() + "\nAge - " + this.Age +"\n");
    }


    public static void main(String[] args) {
        Breed Akita = Breed.AKITA;
        Breed AUSTRALIAN_KELPIE = Breed.AUSTRALIAN_KELPIE;
        Breed PEMBROKE_WELSH_CORGI = Breed.PEMBROKE_WELSH_CORGI;
        Dog friend1 = new Dog("Chappie", Akita, 1);
        Dog friend2 = new Dog("Apelsyn", AUSTRALIAN_KELPIE, 3);
        Dog friend3 = new Dog("Furry", PEMBROKE_WELSH_CORGI, 2);
        friend1.getFriend();
        friend2.getFriend();
        friend3.getFriend();
        System.out.println("Are there dogs with the same name?");
        System.out.print((friend1.name == friend2.name) || (friend3.name == friend2.name) || (friend1.name == friend3.name));
    }
}

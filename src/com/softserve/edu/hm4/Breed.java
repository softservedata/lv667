package com.softserve.edu.hm4;

public enum Breed {

    BULLDOG("Bulldog",10),
    POODLE("Poodle",15),
    CHIHUAHUA("Chihuahua",20),
    DOBERMAN("Dobermann",13),
    SHIBA_INU("Shiba Inu",15),
    ROTTWEILER("Rottweiler",10),
    CANE_CORSO("Cane Corso",12);

    private final String breedTitle;
    private final int maxLifespan;

    private Breed(String breedTitle, int maxLifespan){
         this.breedTitle = breedTitle;
         this.maxLifespan =maxLifespan;
     }

    public String getBreedTitle() {return breedTitle;}
    public int getMaxLifespan() {return maxLifespan;}
}

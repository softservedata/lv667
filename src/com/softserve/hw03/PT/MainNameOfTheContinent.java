package com.softserve.hw03.PT;

import java.util.Scanner;

public class MainNameOfTheContinent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name Country: ");
        String answerCountry = sc.nextLine();
        Countries countriesName;

        switch (answerCountry.toUpperCase()) {
            case "UKRAINE":
                countriesName = Countries.UKRAINE;
                System.out.println(countriesName.getContinents());
                break;
            case "POLAND":
                countriesName = Countries.POLAND;
                System.out.println(countriesName.getContinents());
                break;
            case "GERMANY":
                countriesName = Countries.GERMANY;
                System.out.println(countriesName.getContinents());
                break;
            case "TURKEY":
                countriesName = Countries.TURKEY;
                System.out.println(countriesName.getContinents());
                break;
            case "CHINA":
                countriesName = Countries.CHINA;
                System.out.println(countriesName.getContinents());
                break;
            case "INDIA":
                countriesName = Countries.INDIA;
                System.out.println(countriesName.getContinents());
                break;
            case "NIGERIA":
                countriesName = Countries.NIGERIA;
                System.out.println(countriesName.getContinents());
                break;
            case "ETHIOPIA":
                countriesName = Countries.ETHIOPIA;
                System.out.println(countriesName.getContinents());
                break;
            case "EGYPT":
                countriesName = Countries.EGYPT;
                System.out.println(countriesName.getContinents());
                break;
            case "UNITED_STATES":
                countriesName = Countries.UNITED_STATES;
                System.out.println(countriesName.getContinents());
                break;
            case "CANADA":
                countriesName = Countries.CANADA;
                System.out.println(countriesName.getContinents());
                break;
            case "MEXICO":
                countriesName = Countries.MEXICO;
                System.out.println(countriesName.getContinents());
                break;
            case "BRAZIL":
                countriesName = Countries.BRAZIL;
                System.out.println(countriesName.getContinents());
                break;
            case "COLOMBIA":
                countriesName = Countries.COLOMBIA;
                System.out.println(countriesName.getContinents());
                break;
            case "ARGENTINA":
                countriesName = Countries.ARGENTINA;
                System.out.println(countriesName.getContinents());
                break;
            case "AUSTRALIA":
                countriesName = Countries.AUSTRALIA;
                System.out.println(countriesName.getContinents());
                break;

        }
    }

    enum Continents {
        EUROPE, ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA;
    }

    enum Countries {
        UKRAINE("Ukraine", Continents.EUROPE), POLAND("Poland", Continents.EUROPE), GERMANY("Germany", Continents.EUROPE),
        TURKEY("Turkey", Continents.ASIA), CHINA("China", Continents.ASIA), INDIA("India", Continents.ASIA),
        NIGERIA("Nigeria", Continents.AFRICA), ETHIOPIA("Ethiopia", Continents.AFRICA), EGYPT("Egypt", Continents.AFRICA),
        UNITED_STATES("United States", Continents.NORTH_AMERICA), CANADA("Canada", Continents.NORTH_AMERICA),
        MEXICO("Mexico", Continents.NORTH_AMERICA),
        BRAZIL("Brazil", Continents.SOUTH_AMERICA), COLOMBIA("Colombia", Continents.SOUTH_AMERICA),
        ARGENTINA("Argentina", Continents.SOUTH_AMERICA),
        AUSTRALIA("Australia", Continents.AUSTRALIA);
        private String name;
        private Continents continents;

        Countries(String name, Continents continents) {
            this.name = name;
            this.continents = continents;
        }

        public String getName() {
            return name;
        }

        public Continents getContinents() {
            return continents;
        }
    }
}



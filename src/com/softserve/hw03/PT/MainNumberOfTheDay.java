package com.softserve.hw03.PT;

import java.util.Scanner;

public class MainNumberOfTheDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week:");
        String answerDay = sc.nextLine();
        NumberDay numberDay;

        switch (answerDay) {
            case "1":
                numberDay = NumberDay.day1;
                System.out.println(numberDay.getEn());
                System.out.println(numberDay.getUa());
                System.out.println(numberDay.getRu());
                break;
            case "2":
                numberDay = NumberDay.day2;
                System.out.println(numberDay.getEn());
                System.out.println(numberDay.getUa());
                System.out.println(numberDay.getRu());
                break;
            case "3":
                numberDay = NumberDay.day3;
                System.out.println(numberDay.getEn());
                System.out.println(numberDay.getUa());
                System.out.println(numberDay.getRu());
                break;
            case "4":
                numberDay = NumberDay.day4;
                System.out.println(numberDay.getEn());
                System.out.println(numberDay.getUa());
                System.out.println(numberDay.getRu());
                break;
            case "5":
                numberDay = NumberDay.day5;
                System.out.println(numberDay.getEn());
                System.out.println(numberDay.getUa());
                System.out.println(numberDay.getRu());
                break;
            case "6":
                numberDay = NumberDay.day6;
                System.out.println(numberDay.getEn());
                System.out.println(numberDay.getUa());
                System.out.println(numberDay.getRu());
                break;
            case "7":
                numberDay = NumberDay.day7;
                System.out.println(numberDay.getEn());
                System.out.println(numberDay.getUa());
                System.out.println(numberDay.getRu());
                break;
            //optional
            default:
                System.out.println("Please enter the day number, example: 1 or 5");
        }
    }

    enum NumberDay {
        day1("Monday", "Понеділок", "Понедельник"), day2("Tuesday", "Вівторок", "Вторник"),
        day3("Wednesday", "Середа", "Среда"), day4("Thursday", "Четверг", "Четверг"),
        day5("Friday", "П'ятниця", "Пятница"), day6("Saturday", "Субота", "Суббота"),
        day7("Sunday", "Неділя", "Воскесенье");
        private final String en, ua, ru;

        NumberDay(String en, String ua, String ru) {
            this.en = en;
            this.ua = ua;
            this.ru = ru;
        }

        public String getEn() {
            return en;
        }

        public String getUa() {
            return ua;
        }

        public String getRu() {
            return ru;
        }
    }
}




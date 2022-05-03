package com.softserve.edu.hw9_2;

import java.util.Arrays;

public class SpaceService {
    public static void main(String[] args) {

        String str1 = "  My   Name is  Yurij ,   I`m from   Lviv  ))";
        System.out.println("Original sentensec:" + str1);
        //Видаляю пробіли з початку і кінця стрічки
        String str2 = str1.trim();
        System.out.println("str1.trim():" + str2);
        //Розбиваю стрічку на масив стрічок по пробілу як дільнику
        String[] strArr = str2.split(" ");
        String str3 = new String();
        //Виводжу на екран масив розділений по пробілу
        System.out.println(Arrays.toString(strArr));
        //Циклом біжу по елементах масиву і якщо довжина елемента не 0 то записую його в нову стрічку
        //після кожного запису елемента додаю один пробіл
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].isEmpty()) {
                str3 = str3 + strArr[i] + " ";
            }
        }
        System.out.println("Final sentensec:" + str3);


    }
}

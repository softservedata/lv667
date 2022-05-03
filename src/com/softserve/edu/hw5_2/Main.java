package com.softserve.edu.hw5_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee(18,"Yura",60000);
        Employee emp2=new Employee(19,"Oleg",56000);
        Employee emp3=new Employee(23,"Ivan",90000);

        Employee dev1=new Developer(55,"Igor",18000,"Trainee",8);
        Employee dev2=new Developer(20,"Roman",180000 ,"Middle",7);

        Employee [] arr1={emp1, emp2, emp3, dev1, dev2};
       for (int i=0;i< arr1.length;i++)
            System.out.println(arr1[i].report());
        }



    }


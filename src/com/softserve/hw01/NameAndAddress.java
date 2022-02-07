package com.softserve.hw01;

import java.util.Scanner;
        public class NameAndAddress {
            public void findOutNameAndAddress() {
                String name;
                String address;
                Scanner sc = new Scanner(System.in);
                System.out.println("What is your name?");
                name = sc.nextLine();
                System.out.println("Where are you live, " + name + "?");
                address = sc.nextLine();
                System.out.println(name + " live at the Address: " + address);
                sc.close();
            }
        }

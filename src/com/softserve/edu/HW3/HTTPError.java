package com.softserve.edu.HW3;

import java.util.Scanner;

public class HTTPError {

    public static void main(String[] args) {
            Error op = Error.CLIENT_ERROR;
            System.out.print("Write your error:");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(op.action(x));
            sc.close();
        }

    enum Error{
        CLIENT_ERROR{
            public String action(int x) {
                if(x == 400) {
                    return "400 Bad Request";
                }
                if(x == 401) {
                    return "401 Unauthorized";
                }
                return "Unknown code";
            }
        };
        public abstract String action(int x);
    }
}
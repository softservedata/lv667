package com.softserve.hw03.HW;

import java.util.Scanner;

public class MainNameOfHttpError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Http error: ");
        int answerNumberHttpError = sc.nextInt();
        for (HttpError e : HttpError.values()) {
            if (e.code == answerNumberHttpError) {
                System.out.println(e.name);
            }
        }

    }

    enum HttpError {
        err400("Bad Request", 400), err401("Unauthorized", 401),
        err402("Payment Required", 402), err403("Forbidden", 403),
        err404("Not Found", 404);
        private String name;
        private int code;

        HttpError(String name, int code) {
            this.name = name;
            this.code = code;
        }
    }
}
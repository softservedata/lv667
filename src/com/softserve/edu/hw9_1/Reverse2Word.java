package com.softserve.edu.hw9_1;

public class Reverse2Word {
    public static void main(String[] args) {
        String s2 = new String();
        for (int i = 0; i < args.length; i++) {
            s2 = s2 + args[i] + " ";
        }

        System.out.println("Print sentence from console: " + s2);

        String[] arr = s2.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != 1) {
                sb.append(arr[i]);
            } else
                sb.append(new StringBuilder(arr[i]).reverse());
            sb.append(" ");
        }
        System.out.println("Print reverse second word: " + sb);

    }

}

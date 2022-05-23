package com.softserve.edu_15;
/*
Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
Method encrypt should take a string and return coded string where every letter is moved on n positions in alphabet
(e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value
 */
public class Task2 {
    public static void main(String[] args) {
        String s = "abcd";
        int n = 2;
        System.out.println(methods.encrypt(s,n));
        System.out.println(methods.decrypt(s,n));
    }
}

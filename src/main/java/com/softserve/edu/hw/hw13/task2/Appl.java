package com.softserve.edu.hw.hw13.task2;

import com.softserve.edu.hw.hw13.task1.Crypto;

public class Appl {
    public static void main(String[] args) {

        String word = "Marry";
        int n = 10;

        String coded = String.valueOf(Crypto.encrypt(word,n));
        System.out.println("word: \"" + word + "\" was encrypted -> " + coded);

        String decoded = Crypto.decrypt(coded,n);
        System.out.println("word: \"" + coded + "\" was decrypted -> " + decoded);
    }
}

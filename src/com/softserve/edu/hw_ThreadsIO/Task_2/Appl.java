package com.softserve.edu.hw_ThreadsIO.Task_2;

import com.softserve.edu.hw_ThreadsIO.Task_1.Bank;

import java.util.ArrayList;

public class Appl {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Bank> accounts = new ArrayList<>();

        accounts.add(new Bank(300));
        accounts.add(new Bank(400));

        Runnable r1 = () -> {
            System.out.println(Thread.currentThread().getName() + " Start");
            try {
                accounts.get(0).printBalance();
                accounts.get(0).transfer(accounts.get(1), 400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " Finish");
        };

        Runnable r2 = () -> {
            System.out.println(Thread.currentThread().getName() + " Start");
            try {
                accounts.get(1).printBalance();
                accounts.get(1).transfer(accounts.get(0), 500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " Finish");
        };

        Thread thread_1 = new Thread(r1);
        Thread thread_2 = new Thread(r2);

        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();
    }
}

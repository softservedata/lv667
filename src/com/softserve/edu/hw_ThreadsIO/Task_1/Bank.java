package com.softserve.edu.hw_ThreadsIO.Task_1;

public class Bank {
    private int money;

    public Bank(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void transfer(Bank bankTo, int amount) throws InterruptedException {
        {
            while(this.money < amount)
                wait();

            this.money = this.money - amount;
            bankTo.setMoney(bankTo.money + amount);
        }
    }

    public void printBalance(){
        System.out.println("Balance :" + this.getMoney());
    }
}

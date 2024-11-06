package org.example;

public class Account {

    private double balance;


    public Account(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }


    public void deposit(int deposit) {

        this.balance += deposit;
    }

    public void withdraw(int quit) {

        if (balance > quit) {

            this.balance -= quit;

        }


    }
}



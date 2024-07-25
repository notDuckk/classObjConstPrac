package org.example;

public class BankAccount {
    double balance;
    String name;

    public BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double depositAmnt) {
        this.balance += depositAmnt;
    }

    public void withdraw(double withdrawAmnt) {
        this.balance -= withdrawAmnt;
    }

    public void accDetails() {
        System.out.println("Account holder: " + this.name  + "\n" + "Balance: " + this.balance + "\n");
    }
}

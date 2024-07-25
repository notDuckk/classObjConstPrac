package org.example;

public class Main {
    public static void main(String[] args) {

        // Bank Account
        BankAccount bank1 = new BankAccount(500, "Daylen");
        bank1.deposit(100);
        bank1.accDetails();


        // Bank Transfer
        BankAccount bank2 = new BankAccount(5000, "Larry");
        BankAccount bank3 = new BankAccount(300, "Mary");

        bank2.withdraw(100);
        bank3.deposit(100);
        bank2.accDetails();
        bank3.accDetails();


        // Product
        Product prod1 = new Product(4,4,"Gallon of gas");
        prod1.printProduct();
        prod1.totalCost();


    }
}
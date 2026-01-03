package com.encapsulation.bankingsystem;

abstract class BankAccount {

    // Encapsulated fields
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters (no direct access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs." + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method
    abstract double calculateInterest();

    // Common method
    public void showAccountDetails() {
        System.out.println("Account No   : " + accountNumber);
        System.out.println("Holder Name  : " + holderName);
        System.out.println("Balance      : Rs." + balance);
    }
}

package com.constructors.levelone;

public class BankAccount {

    public String accountNumber;        
    protected String accountHolder;     
    private double balance;             

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}


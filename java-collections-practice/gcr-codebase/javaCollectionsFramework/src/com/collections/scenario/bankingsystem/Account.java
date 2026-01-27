package com.collections.scenario.bankingsystem;

public class Account {

    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountNo: " + accountNumber + " | Balance: ₹" + balance;
    }
}

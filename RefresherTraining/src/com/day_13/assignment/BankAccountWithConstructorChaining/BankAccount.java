package com.day_13.assignment.BankAccountWithConstructorChaining;

public class BankAccount {
	double balance;
	String accountHolder;
	
	// No-arg constructor
    public BankAccount() {
        this("Unknown", 0);
    }

    // One-arg constructor
    public BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }

    // Two-arg constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

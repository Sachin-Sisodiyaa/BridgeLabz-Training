package com.day_13.assignment.BankAccountWithConstructorChaining;

public class SavingsAccount extends BankAccount {
	
	double interestRate;

    public SavingsAccount() {
        super();
        this.interestRate = 4.5;
    }

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
        this.interestRate = 4.5;
    }
}

package com.constructors.levelone;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   
        System.out.println("Account Holder : " + accountHolder);   
        System.out.println("Balance        : ₹" + getBalance());   
    }
}


package com.day_12.classwork.accessmodifier.bank;

public class BankAccount {

    private int balance = 5000;

    int accountType = 1;                 

    protected String accountHolder = "Sachin";

    public String bankName = "SBI";

    public void sameClassTest() {

        System.out.println("Private: " + balance);
        System.out.println("Default: " + accountType);
        System.out.println("Protected: " + accountHolder);
        System.out.println("Public: " + bankName);
    }
}
package com.inheritance.bankaccounttypes;

public class BankMain {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 200000, 5);

        System.out.println("----- Savings Account -----");
        sa.displayAccountType();

        System.out.println("\n----- Checking Account -----");
        ca.displayAccountType();

        System.out.println("\n----- Fixed Deposit Account -----");
        fd.displayAccountType();
    }
}


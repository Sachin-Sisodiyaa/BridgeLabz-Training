package com.collections.scenario.bankingsystem;

public class BankingMain {

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        // Add accounts
        bank.addAccount(new Account(101, 5000));
        bank.addAccount(new Account(102, 12000));
        bank.addAccount(new Account(103, 8000));

        // Withdrawal requests
        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(103, 3000);
        bank.requestWithdrawal(102, 15000); // insufficient

        // Process queue
        bank.processWithdrawals();

        // Display sorted accounts
        bank.displaySortedAccounts();
    }
}

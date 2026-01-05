/*4. E-Wallet Application
Scenario: Users can register, load money, transfer funds, and view transaction history.
Concepts Used:
● Class: User, Wallet, Transaction
● Constructors: Initialize wallets with optional referral bonus
● Access Modifiers: Make balance private, expose via getBalance()
● Interface: Transferrable with method transferTo(User receiver, double
amount)
● Operators: Used in deductions, taxes, referral credits
● OOP:
○ Encapsulation: Prevent direct manipulation of balance
○ Abstraction: Expose only essential transaction methods
○ Inheritance: PersonalWallet, BusinessWallet with different limits
○ Polymorphism: Same transferTo() method but different business logic*/



package com.dayone.ewallet;

public class EWalletMain {

    public static void main(String[] args) {

        // Creating users with different wallets
        User sachin = new User("Sachin", new PersonalWallet(100));
        User company = new User("TechCorp", new BusinessWallet());

        // Loading money
        sachin.getWallet().loadMoney(500);
        company.getWallet().loadMoney(2000);

        // Transfers (Polymorphism in action)
        sachin.getWallet().transferTo(company, 200);
        company.getWallet().transferTo(sachin, 500);

        // Display balances
        System.out.println("\nSachin Balance: Rs." + sachin.getWallet().getBalance());
        System.out.println("Company Balance: Rs." + company.getWallet().getBalance());

        // Transaction history
        System.out.println("\nSachin Transaction History:");
        sachin.getWallet().showHistory();

        System.out.println("\nCompany Transaction History:");
        company.getWallet().showHistory();
    }
}

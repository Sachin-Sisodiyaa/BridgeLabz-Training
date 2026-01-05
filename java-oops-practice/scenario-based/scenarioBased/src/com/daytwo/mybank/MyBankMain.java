/*7. "MyBank – Managing Customer Accounts"
Story: You're building the core banking module for MyBank, a digital-first bank. Your job is to
manage customer accounts, deposits, and interest calculations.
Requirements:
● Account (base class): fields like accountNumber, balance.
● Derived classes: SavingsAccount, CurrentAccount (using inheritance).
● ITransaction interface: deposit(), withdraw(), checkBalance().
● Use constructors for account initialization with or without an opening balance.
● Encapsulation: balance must be private and only modifiable through methods.
● Use operators for interest: balance * interestRate / 100.
● Polymorphism in calculateInterest() – varies by account type.
● Use access modifiers: protect account data, expose only required operations.*/



package com.daytwo.mybank;

import java.util.Scanner;

public class MyBankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();

        System.out.print("Enter Opening Balance: ");
        double balance = sc.nextDouble();

        // Parent reference (polymorphism)
        Account account;

        if (choice == 1) {
            account = new SavingsAccount(accNumber, balance);
        } else if (choice == 2) {
            account = new CurrentAccount(accNumber, balance);
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());

        account.checkBalance();
        account.calculateInterest(); // runtime polymorphism

        sc.close();
    }
}


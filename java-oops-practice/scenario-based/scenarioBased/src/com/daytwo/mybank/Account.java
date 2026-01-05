package com.daytwo.mybank;

//Base class for all account types
abstract class Account implements ITransaction {

 protected String accountNumber;  
 private double balance;           

 // Constructor with opening balance
 public Account(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Constructor without opening balance
 public Account(String accountNumber) {
     this.accountNumber = accountNumber;
     this.balance = 0;
 }

 // Protected getter for subclasses
 protected double getBalance() {
     return balance;
 }

 // Deposit money
 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Amount deposited: Rs." + amount);
     }
 }

 // Withdraw money
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Amount withdrawn: Rs." + amount);
     } else {
         System.out.println("Insufficient balance!");
     }
 }

 // Check balance
 @Override
 public void checkBalance() {
     System.out.println("Current Balance: Rs." + balance);
 }

 // Polymorphic method
 abstract void calculateInterest();
}


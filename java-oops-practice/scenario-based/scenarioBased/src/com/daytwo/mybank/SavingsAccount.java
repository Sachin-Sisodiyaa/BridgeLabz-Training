package com.daytwo.mybank;

//Savings account with interest
class SavingsAccount extends Account {

 private static final double interestRate = 4.0;

 public SavingsAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 public SavingsAccount(String accountNumber) {
     super(accountNumber);
 }

 // Interest calculation specific to Savings Account
 @Override
 void calculateInterest() {
     double interest = getBalance() * interestRate / 100;
     System.out.println("Savings Account Interest: Rs." + interest);
 }
}


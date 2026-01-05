package com.daytwo.mybank;

class CurrentAccount extends Account {

 private static final double interestRate = 1.0;

 public CurrentAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 public CurrentAccount(String accountNumber) {
     super(accountNumber);
 }

 // Interest calculation specific to Current Account
 @Override
 void calculateInterest() {
     double interest = getBalance() * interestRate / 100;
     System.out.println("Current Account Interest: Rs." + interest);
 }
}


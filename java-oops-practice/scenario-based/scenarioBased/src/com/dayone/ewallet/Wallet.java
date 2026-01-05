package com.dayone.ewallet;

import java.util.ArrayList;

abstract class Wallet implements Transferrable {

 // private → prevents direct manipulation (Encapsulation)
 private double balance;

 protected ArrayList<Transaction> history = new ArrayList<>();

 // Normal wallet constructor
 public Wallet() {
     this.balance = 0;
 }

 // Constructor with referral bonus
 public Wallet(double referralBonus) {
     this.balance = referralBonus;
     history.add(new Transaction("Referral Bonus", referralBonus));
 }

 // Public getter for balance
 public double getBalance() {
     return balance;
 }

 // Load money into wallet
 public void loadMoney(double amount) {
     balance += amount; // Operator usage
     history.add(new Transaction("Money Loaded", amount));
 }

 // Protected method → used internally for transfer
 protected boolean deductBalance(double amount) {
     if (balance >= amount) {
         balance -= amount;
         return true;
     }
     return false;
 }

 protected void addBalance(double amount) {
     balance += amount;
 }

 // View transaction history
 public void showHistory() {
     for (Transaction t : history) {
         t.showTransaction();
     }
 }
}


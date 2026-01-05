package com.dayone.ewallet;

class Transaction {

 private String description;
 private double amount;

 //constructor
 public Transaction(String description, double amount) {
     this.description = description;
     this.amount = amount;
 }

 public void showTransaction() {
     System.out.println(description + " : Rs." + amount);
 }
}


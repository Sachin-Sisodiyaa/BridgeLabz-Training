package com.dayone.hospitalpatientmanagementsystem;

//Bill class handles payment
class Bill implements Payable {

 private double baseAmount;
 private double tax;
 private double discount;

 public Bill(double baseAmount) {
     this.baseAmount = baseAmount;
 }

 // Operators used for calculation
 @Override
 public double calculatePayment() {
     tax = baseAmount * 0.05;        // 5% tax
     discount = baseAmount * 0.10;   // 10% discount
     return baseAmount + tax - discount;
 }
}


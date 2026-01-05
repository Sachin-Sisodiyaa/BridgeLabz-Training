package com.dayone.ewallet;

//Business wallet applies transaction tax
class BusinessWallet extends Wallet {

 public BusinessWallet() {
     super();
 }

 @Override
 public void transferTo(User receiver, double amount) {

     double tax = amount * 0.02; // 2% tax
     double totalDeduction = amount + tax;

     if (deductBalance(totalDeduction)) {
         receiver.getWallet().addBalance(amount);
         history.add(new Transaction("Business Transfer to " + receiver.getName(), amount));
         history.add(new Transaction("Transaction Tax", tax));
     } else {
         System.out.println("Insufficient balance (including tax)!");
     }
 }
}


package com.dayone.ewallet;

class PersonalWallet extends Wallet {

 public PersonalWallet(double referralBonus) {
     super(referralBonus);
 }

 // Polymorphic behavior
 @Override
 public void transferTo(User receiver, double amount) {

     if (deductBalance(amount)) {
         receiver.getWallet().addBalance(amount);
         history.add(new Transaction("Transferred to " + receiver.getName(), amount));
     } else {
         System.out.println("Insufficient balance!");
     }
 }
}


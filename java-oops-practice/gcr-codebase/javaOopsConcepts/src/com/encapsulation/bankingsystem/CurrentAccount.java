package com.encapsulation.bankingsystem;

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }
}

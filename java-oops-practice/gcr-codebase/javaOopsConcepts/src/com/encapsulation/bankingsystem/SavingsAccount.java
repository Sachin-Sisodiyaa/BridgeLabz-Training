package com.encapsulation.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings account loan applied for ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // eligibility
    }
}

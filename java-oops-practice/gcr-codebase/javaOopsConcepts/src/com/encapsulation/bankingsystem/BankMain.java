package com.encapsulation.bankingsystem;

import java.util.ArrayList;

public class BankMain {

    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SA101", "Rahul", 50000);
        BankAccount acc2 = new CurrentAccount("CA202", "Anita", 80000);

        accounts.add(acc1);
        accounts.add(acc2);

        // 🔹 Polymorphism in action
        for (BankAccount acc : accounts) {

            acc.showAccountDetails();
            System.out.println("Interest Earned : Rs." + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan(200000);
                System.out.println("Loan Eligibility : Rs." + loan.calculateLoanEligibility());
            }

            System.out.println("--------------------------------");
        }
    }
}

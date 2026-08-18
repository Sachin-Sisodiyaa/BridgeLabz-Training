package com.day_13.assignment.BankAccountWithConstructorChaining;

public class Test {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Sachin");
        BankAccount b3 = new BankAccount("Rahul", 5000);

        SavingsAccount s1 = new SavingsAccount();
        SavingsAccount s2 = new SavingsAccount("Amit", 10000);

        System.out.println(b1.accountHolder + " : " + b1.balance);
        System.out.println(b2.accountHolder + " : " + b2.balance);
        System.out.println(b3.accountHolder + " : " + b3.balance);

        System.out.println(s1.accountHolder + " : " + s1.balance
                + " : " + s1.interestRate);

        System.out.println(s2.accountHolder + " : " + s2.balance
                + " : " + s2.interestRate);
    }
}
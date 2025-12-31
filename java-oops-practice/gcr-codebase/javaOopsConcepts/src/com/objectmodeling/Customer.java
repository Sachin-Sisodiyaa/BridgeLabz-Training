package com.objectmodeling;

public class Customer {

    private String name;
    private double balance;
    private Bank bank;   // Association with Bank

    public Customer(String name) {
        this.name = name;
    }

    // Associate customer with a bank
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    // Method to view balance
    public void viewBalance() {
        System.out.println("Customer Name : " + name);
        System.out.println("Bank          : " + bank.getBankName());
        System.out.println("Balance       : ₹" + balance);
    }
}


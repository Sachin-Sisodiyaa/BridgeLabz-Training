package com.objectmodeling;

public class CustomerMain {
	public static void main(String[] args) {

        // Bank object
        Bank bank = new Bank("State Bank of India");

        // Customer objects
        Customer c1 = new Customer("Sachin");
        Customer c2 = new Customer("Amit");

        // Association via method calls
        bank.openAccount(c1, 25000);
        bank.openAccount(c2, 40000);

        System.out.println();

        // Customers interacting with bank
        c1.viewBalance();
        System.out.println();
        c2.viewBalance();
    }
}

package com.constructors.levelone;

public class SavingsAccountMain {
	// Main method for testing
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SB101", "Sachin", 25000);

        sa.displayAccountDetails();

        // Modify balance using public method
        sa.setBalance(30000);

        System.out.println("\nAfter Balance Update:");
        sa.displayAccountDetails();
    }
}

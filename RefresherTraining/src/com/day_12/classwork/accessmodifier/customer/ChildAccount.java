package com.day_12.classwork.accessmodifier.customer;

import com.day_12.classwork.accessmodifier.bank.BankAccount;

public class ChildAccount extends BankAccount {

    public void testAccess() {

        // Private
        // System.out.println(balance);              

        // Default
        // System.out.println(accountType);          

        // Protected
        System.out.println(accountHolder);            

        // Public
        System.out.println(bankName);                 
    }

    public static void main(String[] args) {

        ChildAccount account = new ChildAccount();

        account.testAccess();
    }
}
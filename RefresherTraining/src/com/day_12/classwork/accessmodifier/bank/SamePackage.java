package com.day_12.classwork.accessmodifier.bank;

public class SamePackage {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Private
        //System.out.println(account.balance);       

        // Default
        System.out.println(account.accountType);     

        // Protected
        System.out.println(account.accountHolder);    

        // Public
        System.out.println(account.bankName);        
    }
}
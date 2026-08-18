package com.day_12.classwork.accessmodifier;

public class BankAccount {
    public String name;
    private int balance;
    protected long account;
    String address;

    public void details(){
        System.out.println("Name: " + name + " Balance: " + balance + " Account: " + account + " Address: " + address);
    }



    public static void main(String args[]){
        BankAccount b1 = new BankAccount();
        b1.name = "Sachin";
        b1.balance = 5000;
        b1.account = 612400148;
        b1.address = "Bhopal";

        b1.details();
    }
}

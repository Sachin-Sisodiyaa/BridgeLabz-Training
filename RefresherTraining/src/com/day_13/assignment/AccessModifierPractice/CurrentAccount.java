package com.day_13.assignment.AccessModifierPractice;

public class CurrentAccount extends Account{

	public void showBalance() {

        //System.out.println(balance); //ERROR: balance has private access in Account

        System.out.println(getBalance()); // getBalance() is protected
    }}

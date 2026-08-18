package com.day_13.assignment.AccessModifierPractice;

public class Account {

	private double balance;
	
	public void setBalance(int amount) {
		this.balance = amount;
	}
	
	protected double getBalance() {
		return balance;
	}
}

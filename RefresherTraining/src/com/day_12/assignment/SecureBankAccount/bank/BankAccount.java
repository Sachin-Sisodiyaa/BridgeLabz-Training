package com.day_12.assignment.SecureBankAccount.bank;

public class BankAccount {
	
	private double balance;
	protected String accountType;
	int branchCode;
	public String bankName;
	
	public BankAccount(double balance, String accountType, int branchCode, String bankName) {
		if(balance < 0) {
			this.balance = 0;
		}
		else {
			this.balance = balance;
		}
		this.accountType = accountType;
		this.branchCode = branchCode;
		this.bankName = bankName;	
	}
	
	public void deposite(int amount) {
		if(amount < 0) {
			System.out.println("Invalid Amount");
		}
		else {
			balance += amount;
			System.out.println("Amount: " + amount + " Deposite");
		}
	}
	
	public void withdraw(int amount){
		if(amount < balance) {
			balance -= amount;
			System.out.println("Amount: " + amount + " withdraw");
		}
		else {
			System.out.println("Insufficient Balance: " + balance);
		}
	}

	public static void main(String args[]) {
		BankAccount b1 = new BankAccount(5000, "Saving", 148, "Canara");
		
		System.out.println(b1.balance);
		System.out.println(b1.accountType);
		System.out.println(b1.branchCode);
		System.out.println(b1.bankName);
		
		b1.deposite(-500);
		b1.withdraw(7000);
	}
}

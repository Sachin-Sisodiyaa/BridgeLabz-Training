package com.collections.scenario.bankingsystem;

import java.util.*;

public class BankingSystem {

    // 1️⃣ HashMap → AccountNumber → Account
    HashMap<Integer, Account> accounts = new HashMap<>();

    // 2️⃣ TreeMap → Balance → Account
    TreeMap<Double, Account> sortedByBalance = new TreeMap<>();

    // 3️⃣ Queue → Withdrawal requests
    Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Add new account
    public void addAccount(Account acc) {
        accounts.put(acc.accountNumber, acc);
        sortedByBalance.put(acc.balance, acc);
    }

    // Enqueue withdrawal request
    public void requestWithdrawal(int accNo, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accNo, amount));
    }

    // Process withdrawals
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();
            Account acc = accounts.get(req.accountNumber);

            if (acc == null) {
                System.out.println("Account not found: " + req.accountNumber);
                continue;
            }

            if (acc.balance >= req.amount) {
                sortedByBalance.remove(acc.balance);

                acc.balance -= req.amount;

                sortedByBalance.put(acc.balance, acc);
                System.out.println("Withdrawal Successful → " + acc);
            } else {
                System.out.println("Insufficient balance for Account " + acc.accountNumber);
            }
        }
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Account acc : sortedByBalance.values()) {
            System.out.println(acc);
        }
    }
}

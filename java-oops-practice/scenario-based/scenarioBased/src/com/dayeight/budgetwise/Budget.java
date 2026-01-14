package com.dayeight.budgetwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    // category-wise limits
    protected Map<String, Double> categoryLimits = new HashMap<>();

    // encapsulated expense list
    private List<Transaction> transactions = new ArrayList<>();

    public Budget(double income, double limit) {
        this.income = income;
        this.limit = limit;
    }

    public void addCategoryLimit(String category, double amount) {
        categoryLimits.put(category, amount);
    }

    // expenses can be added but not edited directly
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    protected double calculateSavings() {
        return income - getTotalExpenses(); // operator usage
    }

    protected List<Transaction> getTransactions() {
        return transactions;
    }
}

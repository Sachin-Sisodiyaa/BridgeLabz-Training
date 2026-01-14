package com.dayeight.budgetwise;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit) {
        super(income, limit);
    }

    @Override
    public void generateReport() {
        System.out.println("===== Annual Budget Summary =====");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("Annual overspending detected!");
        } else {
            System.out.println("Annual budget is healthy.");
        }
    }
}


/*23. "BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).*/





package com.dayeight.budgetwise;

import java.util.Scanner;

public class BudgetWiseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Budget Type:");
        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        int choice = sc.nextInt();

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Budget Limit: ");
        double limit = sc.nextDouble();

        Budget budget;

        if (choice == 1) {
            budget = new MonthlyBudget(income, limit);
        } else {
            budget = new AnnualBudget(income, limit);
        }

        // Adding transactions
        char more;
        do {
            System.out.print("\nEnter Expense Amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter Category: ");
            sc.nextLine(); // consume newline
            String category = sc.nextLine();

            budget.addTransaction(new Transaction(amount, "EXPENSE", category));

            System.out.print("Add more expenses? (y/n): ");
            more = sc.next().charAt(0);

        } while (more == 'y' || more == 'Y');

        System.out.println();
        budget.generateReport();
        budget.detectOverspend();

        sc.close();
    }
}

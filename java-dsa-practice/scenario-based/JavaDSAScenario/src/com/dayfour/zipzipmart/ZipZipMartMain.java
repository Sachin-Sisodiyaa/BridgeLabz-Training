/*3. ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: ZipZipMart compiles thousands of daily sales records from all branches. To generate
reports, the system sorts transactions by date and amount using Merge Sort, which ensures
stability and efficiency with large datasets.
Key Concepts:
● Divide and conquer
● Large-scale sorting
● Preserves order of equal items (stable)*/




package com.dayfour.zipzipmart;

import java.util.Scanner;
import java.time.LocalDate;

public class ZipZipMartMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        Transaction[] transactions = new Transaction[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Transaction " + (i + 1));

            System.out.print("Enter date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.next());

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            transactions[i] = new Transaction(date, amount);
        }

        MergeSort.sort(transactions, 0, n - 1);

        System.out.println("\nSorted Transactions:");
        for (Transaction t : transactions) {
            System.out.println("Date: " + t.date + " | Amount: " + t.amount);
        }
        sc.close();
    }
}

/*2. BrowserBuddy – Tab History Manager (Doubly Linked List + Stack)
Story: Neha is working on a custom browser. Each open tab maintains its browsing history with "Back" and "Forward" operations. She uses a Doubly Linked List for history and a Stack to hold closed tabs for reopening.
Requirements:
● Support forward and backward navigation.
● Restore recently closed tabs.
● Maintain memory-efficient tab management using pointers.
*/



package com.dayone.browserbuddy;

import java.util.Scanner;

public class BrowserBuddyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserHistory history = new BrowserHistory();
        ClosedTabs tabs = new ClosedTabs();

        int choice;

        do {
            System.out.println("\n===== BrowserBuddy Menu =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Current Tab");
            System.out.println("5. Reopen Last Closed Tab");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    history.visit(sc.nextLine());
                    break;

                case 2:
                    history.back();
                    break;

                case 3:
                    history.forward();
                    break;

                case 4:
                    String current = history.getCurrentPage();
                    tabs.closeTab(current);
                    break;

                case 5:
                    String reopened = tabs.reopenTab();
                    if (reopened != null) {
                        history.visit(reopened);
                    }
                    break;

                case 6:
                    System.out.println("Closing BrowserBuddy...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}

/*1. BookShelf – Library Organizer (HashMap + Linked List)
Story: In a library system, books are arranged based on genre and author. A HashMap maps genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or returned.
Requirements:
● Maintain genre-wise catalog.
● Efficient insert, delete using LinkedList.
● Avoid duplication using HashSet (optional).*/



package com.dayone.bookshelf;

import java.util.Scanner;

public class BookShelfMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n===== Library BookShelf Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow (Remove) Book");
            System.out.println("3. Show Books by Genre");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    library.addBook(new Book(title, author, genre, isbn));
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    library.removeBook(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter Genre: ");
                    library.showByGenre(sc.nextLine());
                    break;

                case 4:
                    System.out.println("📕 Exiting Library System...");
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

/*15. "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates.*/



package com.dayfive.bookbazaar;

import java.util.Scanner;

public class BookBazaarMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- BookBazaar Menu ---");
            System.out.println("1. Place New Order");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            int option = sc.nextInt();

            if (option == 2) {
                System.out.println("\nThank you for using BookBazaar!");
                break;
            }

            sc.nextLine();
            System.out.print("Enter User Name: ");
            String userName = sc.nextLine();

            User user = new User(1, userName);
            Order order = new Order((int) (Math.random() * 1000), user);

            System.out.print("How many books do you want to order? ");
            int bookCount = sc.nextInt();

            for (int i = 1; i <= bookCount; i++) {

                System.out.println("\nBook " + i);
                System.out.println("Choose Book Type: 1. EBook  2. PrintedBook");
                int type = sc.nextInt();

                sc.nextLine();
                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Stock: ");
                int stock = sc.nextInt();

                System.out.print("Quantity: ");
                int quantity = sc.nextInt();

                Book book;
                if (type == 1)
                    book = new EBook(title, author, price, stock);
                else
                    book = new PrintedBook(title, author, price, stock);

                order.addBook(book, quantity);
                
                order.placeOrder();
                
                if (quantity<stock)
                	order.displayOrder();
                else
                	System.out.println();
            }

            
        }

        sc.close();
    }
}

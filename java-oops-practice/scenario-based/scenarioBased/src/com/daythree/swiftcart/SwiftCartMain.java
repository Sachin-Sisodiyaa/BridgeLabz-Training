/*9. "SwiftCart – The Grocery Shopping App"
Story: You're building SwiftCart, an online grocery platform where users add items to cart and
check out. The backend logic for cart management is your task.
Requirements:
● Product class: name, price, category.
● Cart class: holds a list of products and totalPrice.
● Constructors allow cart creation with or without pre-selected items.
● ICheckout interface with generateBill() and applyDiscount().
● Use encapsulation to protect price calculations.
● Operators for total: price * quantity, discount: totalPrice - coupon.
● Inheritance: different product types like PerishableProduct,
NonPerishableProduct.
● Use polymorphism in discount application (e.g., discount varies by product type).
● Apply access modifiers so only Cart can update prices.*/




package com.daythree.swiftcart;

import java.util.Scanner;

public class SwiftCartMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("\n1.Perishable  2.Non-Perishable : ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            Product p;
            if (type == 1)
                p = new PerishableProduct(name, price);
            else
                p = new NonPerishableProduct(name, price);

            cart.addProduct(p, qty);
        }

        System.out.print("\nEnter coupon discount amount: ");
        double coupon = sc.nextDouble();

        cart.applyDiscount(coupon);
        cart.generateBill();

        sc.close();
    }
}


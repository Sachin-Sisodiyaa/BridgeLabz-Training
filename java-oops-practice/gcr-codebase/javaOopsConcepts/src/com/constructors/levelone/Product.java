package com.constructors.levelone;

public class Product {

    // Instance variables unique for each object
    private String productName;
    private double price;

    // Class variable shared among all objects
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        // increment when a product is created
        totalProducts++; 
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
    }

    // Class method (static method)
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

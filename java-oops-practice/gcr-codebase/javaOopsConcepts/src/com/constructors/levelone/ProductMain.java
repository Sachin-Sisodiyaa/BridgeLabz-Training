package com.constructors.levelone;

public class ProductMain {
	// Main method for testing
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Mobile", 25000);
        Product p3 = new Product("Headphones", 3000);

        System.out.println("Product 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        System.out.println("\nProduct 3 Details:");
        p3.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}

package com.encapsulation.ecommerceplatform;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Mobile", 25000));
        products.add(new Clothing(102, "Jacket", 1200));
        products.add(new Groceries(103, "Rice", 800));

        // 🔹 Billing logic included in main (Polymorphism)
        for (Product p : products) {

            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double finalPrice = p.getPrice() + tax - p.calculateDiscount();

            p.showDetails();
            System.out.println("Final Price (Price + Tax - Discount): " + finalPrice);
            System.out.println("--------------------------------");
        }
	}
}

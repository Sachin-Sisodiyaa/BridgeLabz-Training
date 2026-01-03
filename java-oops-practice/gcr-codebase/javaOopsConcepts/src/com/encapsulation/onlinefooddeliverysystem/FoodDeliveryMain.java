package com.encapsulation.onlinefooddeliverysystem;

import java.util.ArrayList;

public class FoodDeliveryMain {

    public static void main(String[] args) {

        ArrayList<FoodItem> order = new ArrayList<>();

        // Adding different food items to a single order
        FoodItem item1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 350, 1);
        FoodItem item3 = new VegItem("Butter Naan", 40, 4);

        order.add(item1);
        order.add(item2);
        order.add(item3);

        double grandTotal = 0;

        // 🔹 Polymorphism: FoodItem reference
        for (FoodItem item : order) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();

            // Apply discount if applicable
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                totalPrice -= d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            System.out.println("Total Price : Rs." + totalPrice);
            System.out.println("--------------------------------");

            grandTotal += totalPrice;
        }

        System.out.println("Grand Total Amount : Rs." + grandTotal);
    }
}



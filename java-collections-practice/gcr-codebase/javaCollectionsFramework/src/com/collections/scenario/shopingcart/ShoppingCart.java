package com.collections.scenario.shopingcart;

import java.util.*;

public class ShoppingCart {

    // 1️⃣ Fast lookup
    private HashMap<String, Double> priceMap = new HashMap<>();

    // 2️⃣ Maintain insertion order
    private LinkedHashMap<String, Double> cartOrder = new LinkedHashMap<>();

    // Add product
    public void addProduct(String product, double price) {
        priceMap.put(product, price);
        cartOrder.put(product, price);
    }

    // Remove product
    public void removeProduct(String product) {
        priceMap.remove(product);
        cartOrder.remove(product);
    }

    // Display all products (normal view)
    public void displayCart() {
        System.out.println("\nCart Items:");
        for (Map.Entry<String, Double> entry : cartOrder.entrySet()) {
            System.out.println(entry.getKey() + " → ₹" + entry.getValue());
        }
    }

    // Display products sorted by price
    public void displaySortedByPrice() {
        System.out.println("\nCart Items Sorted by Price:");

        // TreeMap (Price → Product)
        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " → ₹" + entry.getKey());
        }
    }
}

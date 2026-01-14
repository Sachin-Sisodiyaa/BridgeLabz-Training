package com.daythree.smartcheckout;

import java.util.*;

class SmartCheckout {

    Queue<Customer> customerQueue = new LinkedList<>();
    HashMap<String, Item> inventory = new HashMap<>();

    // Add item to inventory
    void addItemToInventory(String name, int price, int stock) {
        inventory.put(name, new Item(name, price, stock));
    }

    // Add customer to queue
    void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println("Customer added to queue.");
    }

    // Process billing
    void processCheckout() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        int totalBill = 0;

        System.out.println("Billing for: " + customer.name);

        for (String itemName : customer.items.keySet()) {
            int qty = customer.items.get(itemName);

            if (!inventory.containsKey(itemName)) {
                System.out.println(itemName + " not available.");
                continue;
            }

            Item item = inventory.get(itemName);

            if (item.stock < qty) {
                System.out.println("Insufficient stock for " + itemName);
                continue;
            }

            item.stock -= qty;
            int cost = item.price * qty;
            totalBill += cost;

            System.out.println(itemName + " x " + qty + " = Rs." + cost);
        }

        System.out.println("Total Bill: Rs." + totalBill);
    }

    // Display inventory
    void showInventory() {
        for (Item item : inventory.values()) {
            System.out.println(item.name + " | Price: Rs." + item.price + " | Stock: " + item.stock);
        }
    }
}


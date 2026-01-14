package com.daytwo.callcenter;

import java.util.*;

public class CallCenter {

    private Queue<Customer> normalQueue = new LinkedList<>();
    private PriorityQueue<Customer> vipQueue = new PriorityQueue<>(
            (c1, c2) -> Integer.compare(c2.priority, c1.priority)
    );

    private HashMap<String, Integer> callHistory = new HashMap<>();

    // Add customer to queue
    public void addCustomer(String name, int priority) {
        Customer c = new Customer(name, priority);
        if (priority == 1) {
            vipQueue.add(c);
        } else {
            normalQueue.add(c);
        }

        // Update call count
        callHistory.put(name, callHistory.getOrDefault(name, 0) + 1);
        System.out.println(c + " added to queue. Total calls this month: " + callHistory.get(name));
    }

    // Serve next customer
    public void serveNext() {
        Customer c;
        if (!vipQueue.isEmpty()) {
            c = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            c = normalQueue.poll();
        } else {
            System.out.println("No customers in queue.");
            return;
        }
        System.out.println("Serving customer: " + c);
    }

    // Show queues
    public void showQueues() {
        System.out.println("\nVIP Queue:");
        if (vipQueue.isEmpty()) System.out.println("Empty");
        else vipQueue.forEach(System.out::println);

        System.out.println("\nNormal Queue:");
        if (normalQueue.isEmpty()) System.out.println("Empty");
        else normalQueue.forEach(System.out::println);
    }

    // Show customer call history
    public void showCallHistory() {
        System.out.println("\nCustomer Call History:");
        callHistory.forEach((name, count) -> System.out.println(name + ": " + count + " calls"));
    }
}

package com.daytwo.callcenter;

public class Customer {
    String name;
    int priority; // 0 = normal, 1 = VIP

    public Customer(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + (priority == 1 ? " (VIP)" : "");
    }
}

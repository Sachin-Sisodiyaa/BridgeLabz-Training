package com.daynine.tailorshop;

import java.util.ArrayList;

public class InsertionSort {

    public static void sort(ArrayList<Order> orders, int idx) {
    	Order key = orders.get(idx);
        int j =idx - 1;

        while (j >= 0 && orders.get(j).deadLine.isAfter(key.deadLine)) {
            orders.set(j + 1, orders.get(j));
            j--;
        }
        orders.set(j + 1, key);
    }
}

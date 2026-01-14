package com.daythree.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class Roundabout {
    private Vehicle head; // Start of circular linked list
    private Queue<Vehicle> waitingQueue = new LinkedList<>();
    private int maxQueueSize = 5; // Max vehicles in waiting queue

    // Add vehicle to roundabout
    public void enterRoundabout(String plate) {
        Vehicle v = new Vehicle(plate);

        if (head == null) { // Roundabout empty
            head = v;
            head.next = head;
            System.out.println(v + " entered the roundabout.");
            return;
        }

        // Add at end of circular list
        Vehicle temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = v;
        v.next = head;
        System.out.println(v + " entered the roundabout.");
    }

    // Remove vehicle from roundabout
    public void exitRoundabout(String plate) {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = null;
        boolean found = false;

        do {
            if (curr.numberPlate.equals(plate)) {
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Vehicle not found in roundabout.");
            return;
        }

        if (curr == head && head.next == head) { // Only one vehicle
            head = null;
        } else if (curr == head) { // Removing head
            Vehicle tail = head;
            while (tail.next != head) tail = tail.next;
            head = head.next;
            tail.next = head;
        } else {
            prev.next = curr.next;
        }

        System.out.println(curr + " exited the roundabout.");
    }

    // Add vehicle to waiting queue
    public void addToQueue(String plate) {
        if (waitingQueue.size() >= maxQueueSize) {
            System.out.println("Waiting queue full. Cannot add " + plate);
            return;
        }
        waitingQueue.add(new Vehicle(plate));
        System.out.println(plate + " added to waiting queue.");
    }

    // Move vehicle from queue to roundabout
    public void processQueue() {
        if (!waitingQueue.isEmpty()) {
            Vehicle v = waitingQueue.poll();
            enterRoundabout(v.numberPlate);
        } else {
            System.out.println("Waiting queue empty.");
        }
    }

    // Show vehicles in roundabout
    public void showRoundabout() {
        if (head == null) {
            System.out.println("Roundabout empty.");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle temp = head;
        do {
            System.out.print(temp + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }

    // Show waiting queue
    public void showQueue() {
        System.out.println("Waiting Queue: " + waitingQueue);
    }
}


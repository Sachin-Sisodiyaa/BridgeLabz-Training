package com.daytwo.TrainCompanion;

public class Train {

    private Node head;
    private Node tail;
    private Node current;

    // Add compartment at end
    void addCompartment(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = tail = current = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Move forward
    void moveForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No next compartment");
        }
    }

    // Move backward
    void moveBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No previous compartment");
        }
    }

    // Show adjacent compartments
    void showAdjacent() {
        System.out.println("Current: " + current.name);
        System.out.println("Previous: " +
                (current.prev != null ? current.prev.name : "None"));
        System.out.println("Next: " +
                (current.next != null ? current.next.name : "None"));
    }

    // Remove current compartment
    void removeCurrent() {
        if (current == null) return;

        System.out.println("Removing: " + current.name);

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            current = head;
        }
        else if (current == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            current = tail;
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current = current.next;
        }
    }

    // Display full train
    void showTrain() {
        Node temp = head;
        System.out.print("Train: ");
        while (temp != null) {
            System.out.print(temp.name + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

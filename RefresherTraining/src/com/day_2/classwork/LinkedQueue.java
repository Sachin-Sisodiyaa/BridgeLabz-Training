package com.day_2.classwork;

public class LinkedQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    // Enqueue - add element at rear
    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue - remove element from front
    public int dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int data = front.data;

        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        return data;
    }

    // Peek - see front element
    public int peek() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    // Check empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue
    public void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.display();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Deleted: " + queue.dequeue());
        System.out.println("Deleted: " + queue.dequeue());

        System.out.println("Queue after deletion:");
        queue.display();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}

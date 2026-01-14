package com.daythree.parceltracker;

public class Stages {

    private Node head;

    // Add stage at END
    void addStage(String stage) {
        Node newNode = new Node(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add checkpoint at a specific position (1-based index)
    void addCheckpoint(String stage, int position) {
        Node newNode = new Node(stage);

        if (position <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display tracking
    void showTrack() {
        if (head == null) {
            System.out.println("Parcel may be lost.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.stage);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

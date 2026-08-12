package com.day_3.hackerrank;

public class ElementFLL {
	//Method to print LindedList
	static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        SinglyLinkedListNode head = new SinglyLinkedListNode(10);
        head.next = new SinglyLinkedListNode(20);
        head.next.next = new SinglyLinkedListNode(30);
        head.next.next.next = new SinglyLinkedListNode(40);
        head.next.next.next.next = new SinglyLinkedListNode(50);

        // Print linked list
        printLinkedList(head);
    }
}

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

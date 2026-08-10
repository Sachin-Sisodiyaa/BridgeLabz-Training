package com.day_3;

public class ReverseLL {
	public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = llist;

        while (current != null) {
            SinglyLinkedListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Print the linked list
    public static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list: 10 -> 20 -> 30 -> 40 -> 50
        SinglyLinkedListNode head = new SinglyLinkedListNode(10);
        head.next = new SinglyLinkedListNode(20);
        head.next.next = new SinglyLinkedListNode(30);
        head.next.next.next = new SinglyLinkedListNode(40);
        head.next.next.next.next = new SinglyLinkedListNode(50);

        System.out.print("Original List: ");
        printLinkedList(head);

        // Reverse the list
        head = reverse(head);

        System.out.print("Reversed List: ");
        printLinkedList(head);
    }
}

// Node class
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

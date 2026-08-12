package com.day_3.hackerrank;
import java.util.*;

public class ReverseLL {
    static class ReverseLLNode {
        int data;
        ReverseLLNode next;

        ReverseLLNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

	public static ReverseLLNode reverse(ReverseLLNode llist) {

        ReverseLLNode prev = null;
        ReverseLLNode current = llist;

        while (current != null) {
            ReverseLLNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Print the linked list
    public static void printLinkedList(ReverseLLNode head) {
        ReverseLLNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list: 10 -> 20 -> 30 -> 40 -> 50
        ReverseLLNode head = new ReverseLLNode(10);
        head.next = new ReverseLLNode(20);
        head.next.next = new ReverseLLNode(30);
        head.next.next.next = new ReverseLLNode(40);
        head.next.next.next.next = new ReverseLLNode(50);

        System.out.print("Original List: ");
        printLinkedList(head);

        // Reverse the list
        head = reverse(head);

        System.out.print("Reversed List: ");
        printLinkedList(head);
    }
}

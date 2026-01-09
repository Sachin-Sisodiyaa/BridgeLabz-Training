package javaDSAPractice.com.hashmap;

import java.util.Scanner;

class MyHashMapInput {

    static class Node {
        int key, value;
        Node next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 10;
    private Node[] table = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node node = new Node(key, value);
        node.next = table[index];
        table[index] = node;
    }

    public int get(int key) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashMapInput map = new MyHashMapInput();

        while (true) {
            System.out.println("\n1.Put  2.Get  3.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter key and value: ");
                map.put(sc.nextInt(), sc.nextInt());
            } 
            else if (choice == 2) {
                System.out.print("Enter key: ");
                System.out.println("Value: " + map.get(sc.nextInt()));
            } 
            else {
                break;
            }
        }
        sc.close();
    }
}

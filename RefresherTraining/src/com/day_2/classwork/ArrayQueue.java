package com.day_2.classwork;

public class ArrayQueue {
	int[] arr = new int [5];
	int front = 0;
	int rare = -1;
	int size = arr.length;
	
	public void enqueue(int data) {
		if(rare == size - 1) {
			System.out.println("Queue is full");
			return;
		}
		arr[++rare] = data;
	}
	
	public int dequeue() {
		if(front > rare) {
			System.out.println("Queue is empty");
			return -1;
		}
		int removed = arr[front];
		front++;
		return removed;
	}
	
	public int peek() {
		if(front > rare) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}
	
	public void print() {
		if(front > rare) {
			System.out.println("Queue is Empty");
		}
		for(int i=front; i<=rare; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	
	
	public static void main(String args[]) {
		ArrayQueue aq = new ArrayQueue();
		
		aq.enqueue(1);
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		aq.enqueue(5);
		
		
		aq.print();
		
		System.out.println("Removed element: " + aq.dequeue());
		
		System.out.println("Removed element: " + aq.dequeue());
		
		System.out.println("Peek element: " + aq.peek());
		
		aq.print();
	}
}

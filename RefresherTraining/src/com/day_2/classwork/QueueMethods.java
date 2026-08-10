package com.day_2;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.offer(50);//offer use to add element while handling overflow exception

        System.out.println("Queue: " + queue);

        
        System.out.println("Front Element: " + queue.peek());

        
        System.out.println("Removed Element: " + queue.remove());//poll use to fetch and remove element with handling underflow like exception

        System.out.println("Queue after removal: " + queue);

        System.out.println("Is Queue Empty? " + queue.isEmpty());

        System.out.println("Queue Size: " + queue.size());
    }
    
}
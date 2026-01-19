package com.dayten.bagnball;

import java.util.ArrayList;

public class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls = new ArrayList<>();

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public String getId() {
        return id;
    }

    // Add ball if capacity allows
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag is full! Cannot add ball.");
            return;
        }
        balls.add(ball);
        System.out.println("Ball added successfully.");
    }

    // Remove ball by ID
    public void removeBall(String ballId) {
        for (Ball b : balls) {
            if (b.getId().equals(ballId)) {
                balls.remove(b);
                System.out.println("Ball removed successfully.");
                return;
            }
        }
        System.out.println("Ball not found.");
    }

    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }
        for (Ball b : balls) {
            System.out.println(b.getDetails());
        }
    }

    public void displayBagInfo() {
        System.out.println(
            "Bag ID: " + id +
            ", Color: " + color +
            ", Balls: " + balls.size() + "/" + capacity
        );
    }
}


package com.dayfour.fittrack;

class UserProfile {

    private String name;
    private int age;
    private double weight;     
    private String goal;

    // default goal constructor
    UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    // custom goal constructor
    UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    public double getWeight() {
        return weight;
    }

    public void displayProfile() {
        System.out.println("\nName: " + name);
        System.out.println("Goal: " + goal);
    }
}


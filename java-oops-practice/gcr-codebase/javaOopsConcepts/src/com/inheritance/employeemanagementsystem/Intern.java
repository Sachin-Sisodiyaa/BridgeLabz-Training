package com.inheritance.employeemanagementsystem;

public class Intern extends Employee {

    private int duration; // in months

    public Intern(int id, String name, double salary, int duration) {
        super(id, name, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}


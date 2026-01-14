package com.dayseven.skillforge;

public class Course {

    private String title;
    private Instructor instructor;
    private double rating; // Encapsulated
    private String[] modules;
    private final String[] reviews; // read-only

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0;
        this.reviews = new String[100]; // max 100 reviews
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5)
            this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Rating: " + rating);
        System.out.println("Modules: ");
        for (String module : modules) {
            System.out.println(" - " + module);
        }
    }

    public int getModuleCount() {
        return modules.length;
    }
}


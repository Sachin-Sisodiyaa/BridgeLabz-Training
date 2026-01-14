package com.dayseven.skillforge;

public class Student extends User implements ICertifiable {

    private double progress; // % course completion

    public Student(String name, String email, int userId) {
        super(name, email, userId);
        this.progress = 0;
    }

    public void completeModule(int totalModules, int modulesCompleted) {
        progress = (modulesCompleted * 100.0) / totalModules;
        System.out.println(name + " progress: " + progress + "%");
    }

    @Override
    public void generateCertificate() {
        System.out.println("Generating Student Certificate for " + name);
        System.out.println("Course Completion: " + progress + "%");
    }
}

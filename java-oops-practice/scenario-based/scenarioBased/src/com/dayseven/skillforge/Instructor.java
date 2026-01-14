package com.dayseven.skillforge;

public class Instructor extends User implements ICertifiable {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Instructor Certificate for " + name);
        System.out.println("Authorized to manage and grade courses.");
    }
}

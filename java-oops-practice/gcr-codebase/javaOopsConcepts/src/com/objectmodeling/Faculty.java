package com.objectmodeling;

public class Faculty {
    private String facultyName;
    private String subject;

    public Faculty(String facultyName, String subject) {
        this.facultyName = facultyName;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + facultyName + ", Subject: " + subject);
    }
}


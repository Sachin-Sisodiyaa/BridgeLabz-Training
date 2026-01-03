package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;

abstract class Patient {

    // Encapsulated fields
    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters (controlled access)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Protected methods for subclasses
    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected void showMedicalHistory() {
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }

    // Abstract method
    abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}

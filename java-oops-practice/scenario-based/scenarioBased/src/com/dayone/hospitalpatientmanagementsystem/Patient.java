package com.dayone.hospitalpatientmanagementsystem;

abstract class Patient {

 protected int patientId;
 protected String name;
 protected int age;

 // Sensitive data → private
 private String medicalHistory;

 protected Doctor doctor;

 // Normal admission constructor
 public Patient(int patientId, String name, int age, String medicalHistory, Doctor doctor) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
     this.medicalHistory = medicalHistory;
     this.doctor = doctor;
 }

 // Emergency admission constructor (overloaded)
 public Patient(int patientId, String name, int age, Doctor doctor) {
     this(patientId, name, age, "Emergency Case", doctor);
 }

 // Encapsulation: expose summary only
 public String getSummary() {
     return "Patient ID: " + patientId +
            ", Name: " + name +
            ", Age: " + age;
 }

 // Polymorphic method
 public abstract void displayInfo();
}


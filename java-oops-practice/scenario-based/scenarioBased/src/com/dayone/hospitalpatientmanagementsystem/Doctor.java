package com.dayone.hospitalpatientmanagementsystem;

class Doctor {

 private String name;
 private String specialization;

 // Constructor
 public Doctor(String name, String specialization) {
     this.name = name;
     this.specialization = specialization;
 }

 // Polymorphic method
 public void displayInfo() {
     System.out.println("Doctor Name       : " + name);
     System.out.println("Specialization    : " + specialization);
 }
}


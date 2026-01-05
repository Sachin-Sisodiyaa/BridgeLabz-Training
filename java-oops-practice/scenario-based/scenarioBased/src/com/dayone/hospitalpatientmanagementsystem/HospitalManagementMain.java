/*1. Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.*/



package com.dayone.hospitalpatientmanagementsystem;

import java.util.Scanner;

public class HospitalManagementMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Doctor creation
        Doctor doctor = new Doctor("Dr. Mehta", "Cardiology");

        // Choose patient type
        System.out.println("1. In-Patient");
        System.out.println("2. Out-Patient");
        int choice = sc.nextInt();

        Patient patient; // Parent reference (polymorphism)

        if (choice == 1) {
            patient = new InPatient(
                    101, "Rahul", 45,
                    "Heart Condition", doctor, 5);
        } else {
            patient = new OutPatient(
                    102, "Anita", 30,
                    "General Checkup", doctor, 800);
        }

        // Polymorphic call
        System.out.println("\n===== Patient Details =====");
        patient.displayInfo();

        // Billing
        Bill bill = new Bill(5000);
        System.out.println("\nTotal Bill Amount: Rs." + bill.calculatePayment());

        sc.close();
    }
}


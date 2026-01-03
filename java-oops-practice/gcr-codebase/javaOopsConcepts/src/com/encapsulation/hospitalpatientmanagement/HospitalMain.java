package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;

public class HospitalMain {

    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Rahul", 45, 5, 3000);
        Patient p2 = new OutPatient(102, "Anita", 30, 800);

        patients.add(p1);
        patients.add(p2);

        // Add medical records
        ((MedicalRecord) p1).addRecord("Admitted for surgery");
        ((MedicalRecord) p2).addRecord("General consultation");

        System.out.println("-----Patient Billing Details -----");

        // 🔹 Polymorphism in action
        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Total Bill : Rs." + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println("--------------------------------");
        }
    }
}


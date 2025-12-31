package com.objectmodeling;

import java.util.ArrayList;

public class Doctor {
    private String doctorName;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);  // bidirectional association

        System.out.println("Consultation:");
        System.out.println("Doctor " + doctorName +
                " (" + specialization + ") is consulting patient " +
                patient.getPatientName());
    }

    public void showPatients() {
        System.out.println("Patients consulted by Dr. " + doctorName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }
}

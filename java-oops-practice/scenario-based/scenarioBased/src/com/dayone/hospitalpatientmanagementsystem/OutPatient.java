package com.dayone.hospitalpatientmanagementsystem;

class OutPatient extends Patient {

 private double consultationFee;

 public OutPatient(int patientId, String name, int age,
                   String medicalHistory, Doctor doctor, double consultationFee) {
     super(patientId, name, age, medicalHistory, doctor);
     this.consultationFee = consultationFee;
 }

 @Override
 public void displayInfo() {
     System.out.println("Patient Type      : Out-Patient");
     System.out.println(getSummary());
     System.out.println("Consultation Fee  : Rs." + consultationFee);
     doctor.displayInfo();
 }

 public double getConsultationFee() {
     return consultationFee;
 }
}


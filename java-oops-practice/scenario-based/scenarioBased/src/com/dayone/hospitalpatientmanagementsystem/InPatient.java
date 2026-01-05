package com.dayone.hospitalpatientmanagementsystem;

class InPatient extends Patient {

 private int daysAdmitted;

 public InPatient(int patientId, String name, int age,
                  String medicalHistory, Doctor doctor, int daysAdmitted) {
     super(patientId, name, age, medicalHistory, doctor);
     this.daysAdmitted = daysAdmitted;
 }

 // Overridden method
 @Override
 public void displayInfo() {
     System.out.println("Patient Type      : In-Patient");
     System.out.println(getSummary());
     System.out.println("Days Admitted     : " + daysAdmitted);
     doctor.displayInfo();
 }

 public int getDaysAdmitted() {
     return daysAdmitted;
 }
}


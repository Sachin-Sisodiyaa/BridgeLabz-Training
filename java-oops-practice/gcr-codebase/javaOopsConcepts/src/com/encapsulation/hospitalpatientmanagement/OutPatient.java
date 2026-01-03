package com.encapsulation.hospitalpatientmanagement;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        showMedicalHistory();
    }
}


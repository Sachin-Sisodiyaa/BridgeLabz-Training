package com.objectmodeling;

public class HospitalMain {
	public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Mehta", "Neurologist");

        Patient p1 = new Patient("Sachin");
        Patient p2 = new Patient("Amit");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.displayHospitalInfo();
        System.out.println();

        // Consultations (communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();
        d1.showPatients();
        d2.showPatients();

        System.out.println();
        p1.showDoctors();
        p2.showDoctors();
    }
}

package com.tit.hospitalmanagement;

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patients
        Patient inPatient = new InPatient("P0034", "Darshan Yadav", 24, 2000.0, 5);
        Patient outPatient = new OutPatient("P0088", "Rajveer Kajle", 25, 500.0);

        // Adding medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery.");
        ((MedicalRecord) inPatient).addRecord("Surgery completed successfully.");
        ((MedicalRecord) outPatient).addRecord("Consulted for fever.");
        ((MedicalRecord) outPatient).addRecord("Prescribed medication.");

        // Displaying patient details and bills
        Patient[] patients = {inPatient, outPatient};
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill Amount: " + patient.calculateBill());
            ((MedicalRecord) patient).viewRecords();
            System.out.println();
        }
    }
}
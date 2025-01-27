package com.tit.hospitalmanagement;

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double roomChargesPerDay;
    private int numberOfDays;
    private String medicalHistory;

    public InPatient(String patientId, String name, int age, double roomChargesPerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargesPerDay = roomChargesPerDay;
        this.numberOfDays = numberOfDays;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return roomChargesPerDay * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:\n" + medicalHistory);
    }
}

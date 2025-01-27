package com.tit.hospitalmanagement;

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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

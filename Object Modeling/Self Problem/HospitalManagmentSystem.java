//class to represent patient

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctorsList;

    //constructor to initialize patient
    public Patient(String name) {
        this.name = name;
        this.doctorsList = new ArrayList<>();
    }

    //method to add doctor for consultation
    public void addDoctor(Doctor doctor) {
        doctorsList.add(doctor);
    }

    //method to display patient details
    public void displayPatient() {
        System.out.println("\nPatient Name- " + name);
    }

    // Method to display all doctors consulting patient
    public void displayAllDoctors() {
        System.out.println("Consulting Doctors-");
        for (Doctor doctor : doctorsList) {
            doctor.displayDoctor();
        }
    }
}
//class to represent doctor
class Doctor {
    private String name;
    private List<Patient> patientsList;

    //constructor to initialize Doctor
    public Doctor(String name) {
        this.name = name;
        this.patientsList = new ArrayList<>();
    }

    //method to add patient for consultation
    public void addPatient(Patient patient) {
        patientsList.add(patient);
    }

    // Method to display doctor's details
    public void displayDoctor() {
        System.out.println("Doctor name- " + name);
    }

    // Method to display all patient consulted by doctor
    public void displayAllPatients() {
        System.out.println("Consulting patients-");
        for (Patient patient : patientsList) {
            patient.displayPatient();
        }
    }

    //method to show communication between doctor and patient
    public void consult(Patient patient) {
        System.out.println();
        this.displayDoctor();
        System.out.println("is consulting with");
        patient.displayPatient();
        System.out.println();
    }
}
//class to represent hospital
class Hospital {
    private String hospitalName;
    private List<Doctor> doctorsList;

    //constructor to initialize hospital object
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctorsList = new ArrayList<>();
    }

    //method to add doctor in hospital
    public void addDoctor(Doctor doctor) {
        doctorsList.add(doctor);
    }

    //method to display hospital details
    public void displayHospital() {
        System.out.println("Hospital Name- " + hospitalName +
                     "\nDoctors in Hospital -");
        for (Doctor doctor : doctorsList) {
            doctor.displayDoctor();
        }
    }
}
public class HospitalManagmentSystem {
    public static void main(String[] args) {
         // create patient object
         Patient rajPatient = new Patient("Raj");
         Patient veerPatient = new Patient("Veer");

        //create object of doctor
        Doctor doctor1 = new Doctor("Dr. Mishra");
        Doctor doctor2 = new Doctor("Dr. pandey");

        //add patient and doctor
        doctor1.addPatient(rajPatient);
        doctor1.addPatient(veerPatient);
        doctor2.addPatient(veerPatient);

        rajPatient.addDoctor(doctor1);
        veerPatient.addDoctor(doctor1);
        veerPatient.addDoctor(doctor2);

        //creating object of hospital
        Hospital hospital = new Hospital("City hospital");
        //add doctors to hospital 
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        //display hospital details
        hospital.displayHospital();

        //display patient with doctor
        rajPatient.displayPatient();
        rajPatient.displayAllDoctors();

        veerPatient.displayPatient();
        veerPatient.displayAllDoctors();

        //display consultation
        doctor1.consult(rajPatient);
        doctor1.consult(veerPatient);
        doctor2.consult(veerPatient);
    }
}
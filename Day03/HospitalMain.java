// HospitalMain class containing the main method
public class HospitalMain {
    public static void main(String[] args) {
        // Set the hospital name
        Patient.hospitalName = "District Hospital Bhopal";

        // Create patient objects
        Patient patient1 = new Patient("Darshan", 22, "Fever", "P034");
        Patient patient2 = new Patient("Rajveer", 19, "Jaundice", "P0088");

        // Display total number of patients
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());

        // Display details if the objects are instances of the Patient class
        if (patient1 instanceof Patient) {
            patient1.displayDetails();
        }

        if (patient2 instanceof Patient) {
            patient2.displayDetails();
        }
    }
}

// Patient class to manage patient details
class Patient {
    // Static variable shared by all patients
    static String hospitalName;

    // Static variable to track the total number of patients
    private static int totalPatients = 0;

    // Final variable to uniquely identify each patient
    private final String patientID;

    // Instance variables for patient details
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize instance variables
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment the total patients count
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        
    }
}

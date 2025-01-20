// VehicleMain class containing the main method
public class VehicleMain {
    public static void main(String[] args) {
        // Set the initial registration fee
        Vehicle.updateRegistrationFee(500);

        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Darshan", "Car", "R0123");
        Vehicle vehicle2 = new Vehicle("Yadav", "Motorcycle", "R0789");

        // Display registration details if objects are instances of the Vehicle class
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }

        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails();
        }

        // Update the registration fee
        Vehicle.updateRegistrationFee(600);

        // Display the updated fee
        System.out.println("Updated Registration Fee: INR " + Vehicle.getRegistrationFee());

        // Display the registration details again
        if (vehicle1 instanceof Vehicle) {
            vehicle1.displayRegistrationDetails();
        }

        if (vehicle2 instanceof Vehicle) {
            vehicle2.displayRegistrationDetails();
        }
    }
}

// Vehicle class to manage vehicle registration
class Vehicle {
    // Static variable shared by all vehicles
    private static int registrationFee;

    // Final variable to uniquely identify each vehicle
    private final String registrationNumber;

    // Instance variables for owner name and vehicle type
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize instance variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    // Static method to get the current registration fee
    public static int getRegistrationFee() {
        return registrationFee;
    }

    // Method to display registration details
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: INR " + registrationFee);
        
    }
}

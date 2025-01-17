import java.util.Scanner; // Importing Scanner class for taking user input

// Class representing a Mobile Phone
public class MobilePhone {
    // Attributes to store mobile phone details
    String brand, model; 
    double price;

    // Constructor to initialize the MobilePhone object with brand, model, and price
    MobilePhone(String brand, String model, double price) {
        this.brand = brand; // Assigning brand to the object
        this.model = model; // Assigning model name to the object
        this.price = price; // Assigning price to the object
    }

    // Method to display the details of the mobile phone
    public void display() {
        // Printing the mobile phone details
        System.out.println("Price of Mobile brand " + brand + 
                           " Model Name " + model + 
                           " is " + price);
    }
}

// Main class to test the MobilePhone class
class MobilePhoneMain {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        
        // Prompting the user to enter mobile phone details
        System.out.println("Enter Mobile Brand Name:");
        String brand = input.next(); // Reading mobile brand name

        System.out.println("Enter Model Name:");
        String model = input.next(); // Reading mobile model name

        System.out.println("Enter Mobile Price:");
        double price = input.nextDouble(); // Reading mobile price

        // Creating a MobilePhone object with the user-provided details
        MobilePhone mobilePhone = new MobilePhone(brand, model, price);

        // Displaying the details of the mobile phone
        mobilePhone.display();

        input.close(); // Closing the Scanner object
    }
}

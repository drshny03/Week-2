import java.util.Scanner; // Importing Scanner class for taking user input

// Class representing a Circle
public class Circle {
    double radius; // Instance variable to store the radius of the circle

    // Constructor to initialize the Circle object with a radius
    Circle(double radius) {
        this.radius = radius; // Assigning radius to the object
    }

    // Method to calculate and display the area of the circle
    public void display() {
        double area = getArea(radius); // Calculating the area using getArea method
        System.out.println("Area Of Circle: " + area); // Displaying the area of the circle
    }

    // Method to calculate the area of the circle
    public double getArea(double radius) {
        return 3.14 * radius * radius; // Formula for area of a circle: πr^2
    }
}

// Main class to test the Circle class
class CircleMain {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        
        // Prompting the user to enter the radius of the circle
        System.out.println("Enter Radius: ");
        double radius = input.nextDouble(); // Reading the radius as a double value
        
        // Creating a Circle object with the user-provided radius
        Circle circle = new Circle(radius);

        // Displaying the area of the circle
        circle.display();
        
        input.close(); // Closing the Scanner object
    }
}

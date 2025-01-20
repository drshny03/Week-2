// Circle class definition
public class Circle {
    private double radius; // Radius of the circle

    // Default constructor - sets radius to a default value (e.g., 1.0)
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default radius
    }

    // Parameterized constructor - initializes radius with user-provided value
    public Circle(double radius) {
        this.radius = radius; // Set the radius
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return 3.14 * radius * radius; // Area = π * r^2
    }

    

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
       
    }
    class CircleMain
    {
        // Main method to demonstrate constructor chaining
            public static void main(String[] args) {
                // Using default constructor
                Circle defaultCircle = new Circle();
                System.out.println("Default Constructor Circle:");
                defaultCircle.displayDetails();

                // Using parameterized constructor
                Circle customCircle = new Circle(5.0);
                System.out.println("\nParameterized Constructor Circle:");
                customCircle.displayDetails();
            }
    }
}

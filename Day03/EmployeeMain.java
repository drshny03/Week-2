// EmployeeMain class containing the main method
public class EmployeeMain {
    public static void main(String[] args) {
        // Set the company name
        Employee.companyName = "Y tech group";

        // Create employee objects
        Employee emp1 = new Employee("Darshan Yadav", "E003", "Software Engineer");
        Employee emp2 = new Employee("Rajveer", "E0088", "Project Manager");

        // Display the total number of employees
        Employee.displayTotalEmployees();

        // Check if the objects are instances of Employee and print their details
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }
    }
}

// Employee class to manage employee details
class Employee {
    // Static variable shared across all employees
    static String companyName;

    // Static variable to track the total number of employees
    private static int totalEmployees = 0;

    // Final variable to ensure employee ID cannot be changed
    private final String id;

    // Instance variables for name and designation
    private String name;
    private String designation;

    // Constructor using 'this' to initialize instance variables
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employees count
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
       
    }
}

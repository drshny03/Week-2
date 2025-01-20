// Base Employee class
class Employee {
    public String employeeID;   // employeeID is public
    protected String department; // department is protected
    private double salary;       // salary is private

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify the salary
    public void modifySalary(double salary) {
        if (salary >= 0) { // Ensure salary is not negative
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: INR " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {

    // Constructor for Manager
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);  // Accessing the public employeeID
        System.out.println("Department: " + department);   // Accessing the protected department
    }
}

// Main class with the main method
public class EmployeeRecordsMain {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("12345", "Engineering", 55000.0);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        // Modify salary using the modifySalary method
        System.out.println("\nUpdating Salary:");
        employee.modifySalary(60000.0);
        employee.displayEmployeeDetails();

        // Create a Manager object
        Manager manager = new Manager("98765", "HR", 75000.0);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}

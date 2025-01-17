import java.util.Scanner; // Importing Scanner class for taking user input

// Class representing an Employee
class Employee {
    // Attributes to store employee details
    String name; 
    int id; 
    double salary;
    
    // Constructor to initialize the Employee object with name, ID, and salary
    Employee(String name, int id, double salary) {
        this.name = name; // Assigning name to the object
        this.id = id; // Assigning ID to the object
        this.salary = salary; // Assigning salary to the object
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee Name: " + name + 
                           "\nEmployee Id: " + id + 
                           "\nEmployee Salary: " + salary); // Printing employee details
    }
}

// Main class to test the Employee class
class EmployeeMain {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        
        // Prompting the user to enter employee details
        System.out.println("Enter Employee Name:");
        String name = input.next(); // Reading employee name

        System.out.println("Enter Employee Id:");
        int id = input.nextInt(); // Reading employee ID

        System.out.println("Enter Employee Salary:");
        double salary = input.nextDouble(); // Reading employee salary

        // Creating an Employee object with the user-provided details
        Employee employee = new Employee(name, id, salary);

        // Displaying the employee details
        employee.display();

        input.close(); // Closing the Scanner object
    }
}

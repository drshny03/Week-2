import java.util.Scanner; // Importing Scanner class for user input

// Class representing a Student
class Student {
    // Attributes to store student details
    String name, rollNumber;
    int marks;

    // Constructor to initialize Student object with name, roll number, and marks
    Student(String name, String rollNumber, int marks) {
        this.name = name; // Assigning student name to the object
        this.rollNumber = rollNumber; // Assigning roll number to the object
        this.marks = marks; // Assigning marks to the object
    }

    // Method to calculate grade based on marks
    public char getGrade(int marks) {
        if (marks > 80) {
            return 'A'; // Grade A for marks above 80
        } else if (marks > 60) {
            return 'B'; // Grade B for marks between 61 and 80
        } else if (marks > 40) {
            return 'C'; // Grade C for marks between 41 and 60
        } else {
            return 'F'; // Grade F for marks 40 or below
        }
    }

    // Method to display student details along with the grade
    public void display(char grade) {
        System.out.println("Student Name: " + name + 
                           "\nRoll Number: " + rollNumber + 
                           "\nMarks: " + marks + 
                           "\nGrade: " + grade); // Printing student details and grade
    }
}

// Main class to test the Student class
class StudentMain {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input

        // Prompting the user to enter student details
        System.out.println("Enter Student Name:");
        String name = input.next(); // Reading student name

        System.out.println("Enter Student Roll Number:");
        String rollNumber = input.next(); // Reading student roll number

        System.out.println("Enter Student Marks:");
        int marks = input.nextInt(); // Reading student marks

        // Creating a Student object with the user-provided details
        Student student = new Student(name, rollNumber, marks);

        // Calculating grade based on marks
        char grade = student.getGrade(marks);

        // Displaying student details along with the grade
        student.display(grade);

        input.close(); // Closing the Scanner object
    }
}

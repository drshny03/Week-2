// UniversityMain class containing the main method
public class UniversityMain {
    public static void main(String[] args) {
        // Set the university name
        Student.universityName = "TIT University";

        // Create student objects
        Student student1 = new Student("Darshan", "034", "A");
        Student student2 = new Student("Rajveer", "088", "B+");

        // Display the total number of students
        Student.displayTotalStudents();

        // Display student details if they are instances of the Student class
        if (student1 instanceof Student) {
            student1.displayDetails();
        }

        if (student2 instanceof Student) {
            student2.displayDetails();
        }

        // Update grade for a student and display details again
        if (student1 instanceof Student) {
            student1.updateGrade("A+");
            student1.displayDetails();
        }
    }
}

// Student class to manage student data
class Student {
    // Static variable shared across all students
    static String universityName;

    // Static variable to track the total number of students
    private static int totalStudents = 0;

    // Final variable to ensure roll number cannot be changed
    private final String rollNumber;

    // Instance variables for name and grade
    private String name;
    private String grade;

    // Constructor using 'this' to initialize instance variables
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students count
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to update the grade of a student
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated for " + name + " to " + newGrade);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        
    }
}

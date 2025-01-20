// Base Student class
public class Student {
    public int rollNumber;          // Roll number is public
    protected String name;          // Name is protected
    private double CGPA;            // CGPA is private

    // Constructor to initialize the student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify the CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) { // Ensure CGPA is within a valid range
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. It must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass PostgraduateStudent
class PostgraduateStudent extends Student {

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display details specific to postgraduate students
    public void displayPostgraduateDetails() {
      
        System.out.println("Name: " + name); // Accessing the protected member directly
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class with the main method
 class StudentMain {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(34, "Darshan", 7.88);
        System.out.println("Student Details:");
        student.displayStudentDetails();

        // Modify CGPA
        System.out.println("\nUpdating CGPA:");
        student.setCGPA(9.0);
        student.displayStudentDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(88, "Rajveer", 7.99);
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}

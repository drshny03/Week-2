// Course class definition
 class Course {
    private String courseName;  // Name of the course
    private int duration;       // Duration of the course in weeks
    private double fee;         // Fee for the course
    private static String instituteName = "Default Institute"; // Shared among all courses

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: INR " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

// Main class with the main method
public class CourseMain {
    public static void main(String[] args) {
        // Create course objects
        Course course1 = new Course("Java Programming", 3, 20000);
        Course course2 = new Course("Web Development", 6, 15000);

        // Display details of courses before updating the institute name
        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Update the institute name using the class method
        Course.updateInstituteName("Drashan Technology PVT. LTD.");

        // Display details of courses after updating the institute name
        System.out.println("\nAfter Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}

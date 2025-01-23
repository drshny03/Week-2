import java.util.ArrayList;
import java.util.List;

//class to demonstrate student
class Student{
    //Attribute
    private String name;
    private String rollNumber;
    private List<Course> courseList;

    //constructer to initialize student object
    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    //method to get all courses
    public List<Course> getCourses() {
        return courseList;
    }
    //method to add courses
    public void addCourse(List<Course> courseList){
        this.courseList = courseList;
    }
    //meth0d to display student details
    public void displayStudent(){
        System.out.println("Student name - " + name +
                "\nRoll number - " + rollNumber);
    }
}
//class to demonstrate Course
class Course{
    //instance variable
    private String courseName;
    private List<Student> studentList;

    //constructer to initialize course object
    public Course(String courseName) {
        this.courseName = courseName;
    }
    //method to add student in course
    public void addCourse(List<Student> studentList){
        this.studentList = studentList;
    }
    //method to get all students of course
    public List<Student> getStudents() {
        return studentList;
    }

    //method to display course details
    public void displayCourse(){
        System.out.println("Course name - " + courseName);
    }
}
class School{
    //attribute
    private static String schoolName;
    private List<Student> studentList;

    //constructer to initialize school object
    public School(){
        this.studentList = new ArrayList<>();
    }
    //static method to set school name
    public static void setSchoolName(String schoolName) {
        School.schoolName = schoolName;
    }
    public static String getSchoolName(){
        return schoolName;
    }
    //method to add student to school
    public void addStudent(List<Student> studentList) {
        this.studentList = studentList;
    }

}
public class SchoolManagementSystem{
    public static void main(String[] args) {
        //set school name
        School.setSchoolName("TIT International School");

        System.out.println("School - " + School.getSchoolName());
        //creating course objects
        Course course1 = new Course("Computer Network");
        Course course2 = new Course("Operating System");
        Course course3 = new Course("Database");
        //creating student objects
        Student student1 = new Student("Rajveer", "88");
        Student student2 = new Student("Naveen", "99");

        //enroll students in courses
        List<Course> rajveerCourses = new ArrayList<>();
        rajveerCourses.add(course1);
        rajveerCourses.add(course2);
        student1.addCourse(rajveerCourses);

        List<Course> naveenCourses = new ArrayList<>();
        naveenCourses.add(course2);
        naveenCourses.add(course3);
        student2.addCourse(naveenCourses);

        //adding students to courses
        List<Student> CNStudents = new ArrayList<>();
        CNStudents.add(student1);
        course1.addCourse(CNStudents);

        List<Student> OSStudents = new ArrayList<>();
        OSStudents.add(student1);
        OSStudents.add(student2);
        course2.addCourse(OSStudents);

        List<Student> DBStudents = new ArrayList<>();
        DBStudents.add(student2);
        course3.addCourse(DBStudents);

        //adding students to the school
        List<Student> schoolStudents = new ArrayList<>();
        schoolStudents.add(student1);
        schoolStudents.add(student2);

        School school = new School();
        school.addStudent(schoolStudents);

        //display student details and courses
        for (Student student : schoolStudents) {
            student.displayStudent();
            System.out.println("Courses - ");
            for (Course course : student.getCourses()) {
                course.displayCourse();
            }
            System.out.println();
        }


        //displaying course details and their students
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        for (Course course : courses) {
            course.displayCourse();
            System.out.println("Enrolled Students:");
            for (Student student : course.getStudents()) {
                student.displayStudent();
            }
            System.out.println();
        }

    }
}

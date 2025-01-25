package com.tit.week02.day05.hierarchicalinheritance.schoolsystem;

public class PersonMain {
    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher("Mr. Darshan", 24, "Mathematics");
        teacher.displayRole();

        System.out.println("\n");

        // Create a Student object
        Student student = new Student("Rajveer", 17, 12);
        student.displayRole();

        System.out.println("\n");

        // Create a Staff object
        Staff staff = new Staff("Mr Aditya", 25, "Account Sections");
        staff.displayRole();
    }
}
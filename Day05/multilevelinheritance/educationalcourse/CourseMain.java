package com.tit.week02.day05.multilevelinheritance.educationalcourse;

public class CourseMain {
    public static void main(String[] args) {
        // Base class instance
        Course basicCourse = new Course("Introduction to Programming", 20);
        System.out.println("Basic Course Details:");
        basicCourse.displayCourseDetails();

        // Subclass OnlineCourse instance
        System.out.println("\nOnline Course Details:");
        OnlineCourse onlineCourse = new OnlineCourse("Java Basics", 30, "Udemy", true);
        onlineCourse.displayCourseDetails();

        // Subclass PaidOnlineCourse instance
        System.out.println("\nPaid Online Course Details:");
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 40, "Coursera", true, 100.0, 20.0);
        paidCourse.displayCourseDetails();
    }
}
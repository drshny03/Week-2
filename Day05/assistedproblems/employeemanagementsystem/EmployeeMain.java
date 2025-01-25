package com.tit.week02.day05.assistedproblems.employeemanagementsystem;

public class EmployeeMain  {

    public static void main(String[] args) {

        Employee manager = new Manager("Darshan",03, 124555,25);
        Employee developer = new Developer("Rajveer",88,98765,"Java");
        Employee intern = new Intern("Aditya", 18,7410,"Cloud");

        manager.displayDetails();;
        developer.displayDetails();
        intern.displayDetails();

    }
}

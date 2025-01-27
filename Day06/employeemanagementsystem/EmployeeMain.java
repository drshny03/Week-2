package com.tit.employeemanagementsystem;

// Main class
public class EmployeeMain {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(34, "Darshan Yadav", 50000);
        Employee partTimeEmployee = new PartTimeEmployee(88, "Rajveer Kajle", 500, 20);

        ((Department) fullTimeEmployee).assignDepartment("Engineering");
        ((Department) partTimeEmployee).assignDepartment("Technical Support");

        Employee[] employees = {fullTimeEmployee, partTimeEmployee};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println(((Department) emp).getDepartmentDetails());
            System.out.println();
        }
    }
}
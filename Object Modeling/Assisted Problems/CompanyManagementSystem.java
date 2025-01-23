//import list class
import java.util.ArrayList;
import java.util.List;

//class to demonstrate an Employee
class Employee {
    // attributes
    private String employeeName;
    private String designation;

    // constructer to initialze employee object
    public Employee(String employeeName, String designation) {
        this.employeeName = employeeName;
        this.designation = designation;
    }

    // method to display employee details
    public void displayDetails() {
        System.out.println("Employee name - " + employeeName +
                "\nEmployee designation - " + designation);
    }
}

// class to demonstrate an Department
class Department {
    // instance attribute
    private String departmentName;
    private List<Employee> employeeList;

    // constructer to initialize department object
    public Department(String departmentName) {
        this.departmentName = departmentName;
        // create new arraylist to store employee
        this.employeeList = new ArrayList<>();
    }

    // method to add employee to department
    public void addEmployee(String employeeName, String employeeDesignation ) {
        Employee employee = new Employee(employeeName, employeeDesignation);
        employeeList.add(employee);
    }

    // method to display all employees in the department
    public void displayAllEmployees() {
        System.out.println("\nDepartment- " + departmentName);
        for (Employee employee : employeeList) {
            employee.displayDetails();
        }
    }
}

// class to demonstrate Company
class Company {
    // attributes
    private String companyName;
    private List<Department> departmentList;

    // constructor to initialize Company object
    public Company(String companyName) {
        this.companyName = companyName;
        this.departmentList = new ArrayList<>();
    }

    //method to get department list
    public Department getDepartment(int index){
        return departmentList.get(index);
    }
    // method to add department to company
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departmentList.add(department);
    }

    // method to display department details
    public void displayCompanyDetails() {
        System.out.println("Company- " + companyName);
        for (Department department : departmentList) {
            department.displayAllEmployees();
        }
    }
}

class CompanyManagementSystem {
    // main method
    public static void main(String[] args) {
        //create company object
        Company company = new Company("Rajveer Technologies");
        //add department to company
        company.addDepartment("IT");
        company.addDepartment("HR");

        // add employees
        company.getDepartment(0).addEmployee("Rajveer Kajle" , "DevOps Engineer");
        company.getDepartment(1).addEmployee("Darshan Yadav", "HR Manager");

        //display company details
        company.displayCompanyDetails();

        //demonstrate composition by deleting company
        company = null;
    }
}
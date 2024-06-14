package sistematizacaopoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private String email;
    private String phoneNumber;
    private String allergies;
    private String medicalConditions;

    public Employee(String name, String id, String email, String phoneNumber, String allergies, String medicalConditions) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.allergies = allergies;
        this.medicalConditions = medicalConditions;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Name: " + name + "\n" +
               "ID: " + id + "\n" +
               "Email: " + email + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Allergies: " + allergies + "\n" +
               "Medical Conditions: " + medicalConditions + "\n";
    }
}

class EmployeeManager {
    private Map<String, Employee> employees;

    public EmployeeManager() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Employee getEmployee(String id) {
        return employees.get(id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();

        try {
            while (true) {
                System.out.println("1. Add Employee\n2. Get Employee\n3. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    int choice = scanner.nextInt();
                    scanner.nextLine();  
                    
                    switch (choice) {
                        case 1:
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter email: ");
                            String email = scanner.nextLine();
                            System.out.print("Enter phone number: ");
                            String phoneNumber = scanner.nextLine();
                            System.out.print("Enter allergies: ");
                            String allergies = scanner.nextLine();
                            System.out.print("Enter medical conditions: ");
                            String medicalConditions = scanner.nextLine();

                            Employee employee = new Employee(name, id, email, phoneNumber, allergies, medicalConditions);
                            employeeManager.addEmployee(employee);
                            break;
                        case 2:
                            System.out.print("Enter employee ID: ");
                            String employeeId = scanner.nextLine();
                            Employee emp = employeeManager.getEmployee(employeeId);
                            if (emp != null) {
                                System.out.println(emp);
                            } else {
                                System.out.println("Employee not found.");
                            }
                            break;
                        case 3:
                            System.out.println("Exiting...");
                            return;
                        default:
                            System.out.println("Invalid choice!");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.nextLine(); 
                }
            }
        } finally {
            scanner.close(); 
        }
    }
}

package Question3;

import java.time.LocalDate;
import java.util.*;

class Employee {
    String name;
    int id;
    double salary;
    String department;
    LocalDate dateOfJoining;

    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.dateOfJoining = LocalDate.now();
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Joined On: " + dateOfJoining);
        System.out.println("----------------------------");
    }
}

public class EmployeeAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        Map<Integer, Employee> employeeById = new HashMap<>();
        Set<Employee> employeeSet = new HashSet<>();

        System.out.print("How many employees you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Employee ID: ");
            int id = scanner.nextInt();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            Employee emp = new Employee(name, id, salary, department);

            employees.add(emp);
            employeeById.put(id, emp);
            employeeSet.add(emp);
        }

        Employee[] employeeArray = new Employee[employees.size()];
        for (int i = 0; i < employees.size(); i++) {
            employeeArray[i] = employees.get(i);
        }

        System.out.println("\n--- Employee List ---");
        for (Employee e : employees) {
            e.printDetails();
        }

        System.out.println("\n--- Employees by ID (Map) ---");
        for (int key : employeeById.keySet()) {
            employeeById.get(key).printDetails();
        }

        System.out.println("\n--- Employees from Array ---");
        for (Employee e : employeeArray) {
            e.printDetails();
        }

        System.out.println("\n--- Unique Employees (Set) ---");
        for (Employee e : employeeSet) {
            e.printDetails();
        }

        scanner.close();
    }
}

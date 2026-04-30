import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    // Method to read data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display data
    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
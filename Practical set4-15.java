class Employee {
    String name = "Krishna";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 10;
    String project = "AI System";

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee m = new Manager(); // Upcasting

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails(); // Runtime polymorphism
    }
}
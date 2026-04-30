import java.util.Scanner;

class College {
    String collegeName;

    // Constructor for outer class
    College(String name) {
        collegeName = name;
    }

    // Non-static inner class
    class Admission {
        String studentName;
        String course;

        // Method to accept student details
        void acceptData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        // Method to display admission details
        void displayData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create outer class object
        System.out.print("Enter college name: ");
        String cname = sc.nextLine();
        College college = new College(cname);

        // Create inner class object
        College.Admission admission = college.new Admission();

        // Accept and display data
        admission.acceptData();
        admission.displayData();

        sc.close();
    }
}
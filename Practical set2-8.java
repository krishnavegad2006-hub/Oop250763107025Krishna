class Point {
    int x, y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point();          // Default
        Point p2 = new Point(10, 20);    // Parameterized
        Point p3 = new Point(p2);        // Copy

        System.out.print("Default Constructor: ");
        p1.display();

        System.out.print("Parameterized Constructor: ");
        p2.display();

        System.out.print("Copy Constructor: ");
        p3.display();
    }
}
class Rectangle {
    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println("Default Rectangle Area: " + r1.getArea());
        System.out.println("Default Rectangle Perimeter: " + r1.getPerimeter());

        System.out.println("Custom Rectangle Area: " + r2.getArea());
        System.out.println("Custom Rectangle Perimeter: " + r2.getPerimeter());
    }
}
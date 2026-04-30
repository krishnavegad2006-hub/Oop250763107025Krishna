class RectangleCompare {
    double width, height;

    RectangleCompare(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println();
    }

    public static void main(String[] args) {
        RectangleCompare r1 = new RectangleCompare(4, 40);
        RectangleCompare r2 = new RectangleCompare(3.5, 35.9);

        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println("Rectangle 2:");
        r2.display();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
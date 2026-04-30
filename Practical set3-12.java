class VolumeCalculator {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube (Cuboid)
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();

        double cubeVolume = vc.calculateVolume(3);
        double cuboidVolume = vc.calculateVolume(4, 5, 6);
        double sphereVolume = vc.calculateVolume(2.5, true);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Rectangular Cube: " + cuboidVolume);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}
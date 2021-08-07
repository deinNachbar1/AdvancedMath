package de.deinnachbar.lib.AdvancedMath;

public class Circle {

    public static final double pi = 3.14159265358979323846;

    /**
     * @return circumference
     */
    public static double U(double radius) {
        return 2 * pi * radius;
    }

    /**
     * @return area of a circle
     */
    public static double A(double radius) {
        return pi * radius * radius;
    }

    /**
     * @return volume of a sphere
     */
    public static double sphereVolume(double radius) {
        return 4.0/3.0 * pi * radius * radius * radius;
    }

    /**
     * @return surface of a sphere
     */
    public static double sphereA(double radius) {
        return 4 * pi * radius * radius;
    }

}
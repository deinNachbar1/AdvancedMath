package de.deinnachbar.lib.AdvancedMath;

public class Circle {

    public static final double pi = 3.14159265358979323846;

    public static double U(double radius) {
        return 2 * pi * radius;
    }

    public static double A(double radius) {
        return pi * radius * radius;
    }

    public static double sphereVolume(double radius) {
        return 4.0/3.0 * pi * radius * radius * radius;
    }

    public static double sphereA(double radius) {
        return 4 * pi * radius * radius;
    }

}
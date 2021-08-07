package de.deinnachbar.lib.AdvancedMath;

public class Square {
    public static double U(double a, double b) {
        return a + a + b + b;
    }

    public static double A(double a, double b) {
        return a * b;
    }

    public static double diagonal(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double cubeVolume(double a, double b, double c) {
        return a * b * c;
    }

    public static double cubeA(double a, double b, double c) {
        return 2*(a * b) + 2*(a * c) + 2*(b * c);
    }
}

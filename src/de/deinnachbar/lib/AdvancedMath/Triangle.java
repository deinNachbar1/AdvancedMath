package de.deinnachbar.lib.AdvancedMath;

public class Triangle {

    public static double U(double a, double b, double c) {
        return a + b + c;
    }

    public static double A(double a, double b, double c) {
        double s = U(a, b, c) / 2;
        return Value.power((s * (s - a) * (s - b) * (s - c)), 2);
    }

}

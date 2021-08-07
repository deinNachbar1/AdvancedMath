package de.deinnachbar.lib.AdvancedMath;

public class Square {

    /**
     * @return perimeter of a rectangle
     */
    public static double U(double a, double b) {
        return a + a + b + b;
    }

    /**
     * @return area of a rectangle
     */
    public static double A(double a, double b) {
        return a * b;
    }

    /**
     * @return diagonal of a rectangle
     */
    public static double diagonal(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /**
     * @return volume of a square
     */
    public static double cubeVolume(double a, double b, double c) {
        return a * b * c;
    }

    /**
     * @return surface of a square
     */
    public static double cubeA(double a, double b, double c) {
        return 2*(a * b) + 2*(a * c) + 2*(b * c);
    }
}

package de.deinnachbar.lib.AdvancedMath;

import java.util.ArrayList;
import java.util.List;

public class Value {
    /**
     * @param value  value to be rounded
     * @param decimalPlaces to how many decimal places
     * @return rounded value
     */
    public static double round(double value, int decimalPlaces) {
        double scale = power(10, decimalPlaces);
        return Math.round(value * scale) / scale;
    }

    /**
     * @return {@code value}<sup>{@code x}</sup>
     */
    public static double power(double value, int x) {
        double back = 1;

        if (x > 0) {
            for (int i = 0; i < x; i++) {
                back = back * value;
            }
        } else {
            for (int i = 0; i < -x; i++) {
                back = back * (1 / value);
            }
        }

        return back;
    }

    /**
     * @param numbers   unsorted list of double values
     * @param highFirst if true then sorted from high to low numbers instead of from low to high
     * @return sorted list double values
     */
    public static List<Double> sortNumbers(List<Double> numbers, boolean highFirst) {
        long numSize = numbers.size();
        List<Double> back = new ArrayList<>();

        while (!numbers.isEmpty()) {
            for (int i = 0; i < numSize; i++) {
                double number = numbers.get(i);
                boolean bigger = true;

                for (double numberCompare : numbers) {
                    boolean highLow;

                    if (highFirst) highLow = number < numberCompare;
                    else highLow = number > numberCompare;

                    if (highLow) {
                        bigger = false;
                        break;
                    }
                }

                if (bigger) {
                    back.add(number);
                    numbers.remove(i);
                    break;
                }
            }
        }

        return back;
    }

    /**
     * @param decimal a decimal number
     * @return a binary string
     */
    public static String decToBin(long decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal = (long) Math.floor((double)decimal / 2);
        }

        return binary.toString();
    }

    /**
     * @param binary a binary string
     * @return a decimal number
     * @throws IllegalArgumentException if binary is not a binary number
     */
    public static long binToDec(String binary) {
        if(!binary.matches("([0]|[1])+")){
            throw new IllegalArgumentException("argument binary is not a binary number: \"" + binary + "\"");
        }

        long decimal = 0;
        List<Byte> binaryList = new ArrayList<>();

        int counter = binary.length();

        for(int i = 0; i < binary.length(); i++) {
            binaryList.add((byte)(Character.getNumericValue(binary.charAt(i))));
            counter--;
            decimal += binaryList.get(i) * power(2, counter);
        }

        return decimal;
    }

    /**
     * @param decimalPlaces decimal places
     * @return Value.round(pi, decimalPlaces)
     */
    public static double pi(int decimalPlaces) {
        double pi = 3.141592653589793;

        if(decimalPlaces <= 15) {
            return round(pi, decimalPlaces);
        }else {
            return pi;
        }
    }

    /**
     * @return the square root of <b>value</b> rounded to a specified decimal place
     */
    public static double sqrt(double value, int decimalPlaces) {
        double back = 1;
        double oldBack = 0;
        while ((int) (oldBack * power(10, decimalPlaces) + 0.5) != (int) (back * power(10, decimalPlaces) + 0.5)) {
            oldBack = back;
            back = (back + value / back) / 2;
        }
        return round(back, decimalPlaces);
    }
}

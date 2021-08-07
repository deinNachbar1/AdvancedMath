package de.deinnachbar.lib.AdvancedMath;

import java.util.ArrayList;
import java.util.List;

public class Value {
    public static double round(double value, int commas) {
        double scale = power(10, commas);
        return Math.round(value * scale) / scale;
    }

    public static double power(double value, int x) {

        double back = 1;

        if(x > 0) {
            for(int i = 0; i < x; i++) {
                back = back * value;
            }
        }else {
            for(int i = 0; i < -x; i++) {
                back = back * (1 / value);
            }
        }

        return back;
    }

    public static List<Double> sortNumbers(List<Double> numbers, boolean highFirst) {

        long numSize = numbers.size();
        List<Double> back = new ArrayList<>();

        while (!numbers.isEmpty()) {

            for (int i = 0; i < numSize; i++) {

                double number = numbers.get(i);
                boolean bigger = true;

                for (double numberCompare : numbers) {

                    boolean highLow;

                    if(highFirst) highLow = number < numberCompare;
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
}

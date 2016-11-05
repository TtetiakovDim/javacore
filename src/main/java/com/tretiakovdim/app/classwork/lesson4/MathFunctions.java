package com.tretiakovdim.app.classwork.lesson4;

/**
 * Created  on 19.10.2016.
 */
public class MathFunctions {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static double chooseMaxNumber(double a, double b) {
        return Math.max(a, b);
    }

    public static double getSqurt(double a) {
        return Math.sqrt(a);
    }

    public static double getPow(double a, double b) {
        return Math.pow(a, b);
    }

    public static boolean isOddNumber(int number) {
        if (number % 2 > 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
        }
        return false;
    }

}

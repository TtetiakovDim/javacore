package com.tretiakovdim.app.classwork.utils;

/**
 * Created  on 18.10.2016.
 */
public class Calculate {

    public static double calCircleArea(double radius) {
        double circleArea = Math.PI * radius * radius;
        return (circleArea);

    }


    public static void calculateBigger(double area1, double area2) {

        if (!(area1 <= area2))
            System.out.print("Area 1 is bigger");
        else
            System.out.print("Area 2 is bigger");

    }

    public static boolean rightAngledTriangleCHeck(double a, double b, double c) {
        if (c * c == a * a + b * b) {
            return true;
        } else {
            return false;
        }

    }

}

package com.tretiakovdim.app.classwork.utils;

/**
 * Created  on 18.10.2016.
 */
public class Calculate {

    public static double calCircleArea(double radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area is " + circleArea);
        return (circleArea);

    }


    public static  boolean calculateBigger(double area1, double area2) {

        if (!(area1 <= area2)){
                        System.out.println("Area 1 is bigger");
            return true;}
        else {
            System.out.println("Area 2 is bigger");
            return false;
        }

    }

    public static boolean rightAngledTriangleCHeck(double a, double b, double c) {
//        double rz=a*a;
//        rz=rz+b*b;
//        rz=Math.sqrt(rz);
        if (c * c == ((a * a) + (b * b))) {
            System.out.println("This is right angled triangle" );
            return true;
        } else {
            System.out.println("This is not right angled triangle");
            return false;
        }

    }

    public static boolean cHeckOddOrEven(int number) {
              if (number % 2 > 0) {
            System.out.println("Number is odd");
            return true;
        } else {
            System.out.println("Number is even");
        }
        return false;
    }
}

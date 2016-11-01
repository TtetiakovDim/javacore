package com.tretiakovdim.runners.homework.lesson5;

import com.tretiakovdim.app.classwork.utils.Calculate;

import java.util.Scanner;

/**
 * Created by  on 18.10.2016.
 */
public class Homework5Runner {

    public static void main(String[] args) {
        double a, b, c, aria1, aria2, number;
        Scanner scanner = new Scanner(System.in);
        Calculate myCalc = new Calculate();


        System.out.println(" Programm number enter: 1 -4  ");
        System.out.println(" 1 - right-angled triangle program   ");
        System.out.println(" 2 - calculate circle area program    ");
        System.out.println(" 3 - what an number is bigger/smaller program  ");
        System.out.println(" 4 - exit  ");
        number = scanner.nextDouble();


        if (number == 1) {
            System.out.println(" Enter a :     ");
            a = scanner.nextDouble();
            System.out.println(" Enter b :     ");
            b = scanner.nextDouble();
            System.out.println(" Enter c :     ");
            c = scanner.nextDouble();
            if (myCalc.rightAngledTriangleCHeck(a, b, c)) {
                System.out.println(" This trangle is RightAngled ");
            } else {
                System.out.println(" This trangle is not RightAngled ");
            }
        }
        if (number == 2) {
            System.out.println(" Enter circle radius:     ");
            System.out.println(" Circle area is :     " + myCalc.calCircleArea(scanner.nextDouble()));
        }

        if (number == 3) {
            System.out.println(" Enter Area 1:     ");
            aria1 = scanner.nextDouble();
            System.out.println(" Enter Area 2:     ");
            aria2 = scanner.nextDouble();
            myCalc.calculateBigger(aria1, aria2);
        }


    }
}

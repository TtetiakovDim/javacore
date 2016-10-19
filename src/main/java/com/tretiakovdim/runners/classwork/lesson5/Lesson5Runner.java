package com.tretiakovdim.runners.classwork.lesson5;

import com.tretiakovdim.app.classwork.utils.Calculate;

import java.util.Scanner;
/**
 * Created by Стас on 15.10.2016.
 */
public class Lesson5Runner {
    //  double area1,area2;
    //  Scanner scanner =new Scanner(System.in);
    //  System.out.println(" Enter radius 1 ");
    //   double radius1 =scanner.nextDouble();


    public static void main(String[] args) {
        double  a,b,c;
        System.out.println(" Programm number enter:  ");
        System.out.println(" 1 - right-angled triangle program   ");
        System.out.println(" 2 - calculate circle area program    ");
        System.out.println(" 3 - what an number is bigger/smaller program  ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        Calculate myCalc = new Calculate();
        if (number==1){

            System.out.println(" Enter a ");
              a = scanner.nextDouble();
                  System.out.println(" Enter b ");
              b = scanner.nextDouble();
                   System.out.println(" Enter c ");
             c = scanner.nextDouble();
       if (myCalc.rightAngledTriangleCHeck(a, b, c)) {
            System.out.println(" This trangle is RightAngled ");
       } else {
           System.out.println(" This trangle is not RightAngled ");
       }

        }
        if (number==2) {
            System.out.println(" Enter a ");
            a = scanner.nextDouble();
            System.out.println(" Enter a ");
            b = scanner.nextDouble();
                }
        if (number==3) {
        }

  //       CircleArea mycircleArea = new CircleArea();
 //       System.out.println(" Enter a ");
  //      Scanner scanner = new Scanner(System.in);
  //      double a = scanner.nextDouble();
  //      System.out.println(" Enter b ");
  //      double b = scanner.nextDouble();

  //      System.out.println(" This c = "+ mycircleArea.RightAngledTriangle( a,b));

//        System.out.println(" Enter a ");
 //        a = scanner.nextDouble();
 //       System.out.println(" Enter b ");
  //       b = scanner.nextDouble();
 //       System.out.println(" Enter c ");
 //       double c = scanner.nextDouble();
//        if (mycircleArea.RightAngledTriangleCHeck(a, b, c)) {
//            System.out.println(" This trangle is RightAngled ");
  //      } else {
 //           System.out.println(" This trangle is not RightAngled ");
  //      }


    }
}
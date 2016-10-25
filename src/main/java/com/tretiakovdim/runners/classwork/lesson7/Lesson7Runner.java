package com.tretiakovdim.runners.classwork.lesson7;

import java.util.Scanner;

/**
 * Created by  on 22.10.2016.
 */
public class Lesson7Runner {
    public static void Increment() {
        int a = 1;
        System.out.println(" Original a value " + a);
        System.out.println(" Post - increment a " + a++);
        System.out.println(" Afte post-increment " + a);
        System.out.println(" Pre-increment " + ++a);
        System.out.println(" Afte post-increment " + a);
    }

    public static void Mass(){
        int[] intArray = {1,2,3};
        char[] charsArray = {'q','w','e'};
        int[][] intArrayTwo = {{1,2,5},{1,2,5}};

        for(int i=0;i<intArray.length;i++) System.out.println(intArray[i]);
        for(int i=0;i<charsArray.length;i++) System.out.println(charsArray[i]);
        for(int arrElement:intArray)System.out.println(arrElement);
        //System.out.println(intArray.toSting(array));

    }
    public void Cicle() {

        /*int a, b;
        System.out.println(" enter a : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println(" enter b : ");
        b = scanner.nextInt();

        //while (a > b) {

        /*while (false) {
            System.out.println(" a = " + a + " , b = " + b);
            a = a - 1;
        }
        System.out.println(" a<=b , a= "+a+" ,b= "+b);
*/
        for (int c = 1; c != 11; c++) {
            System.out.println(" c= " + c);
        }
        for (int c = 1; c != 11; c++) {
            System.out.print(" " + c);
        }
        for (int c = 1; c != 11; c++) {
            System.out.format(" c= %d%n", c);
        }

    }

    public static void main(String[] args) {
        //Increment();
        Mass();
    }
}
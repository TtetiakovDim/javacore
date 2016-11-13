package com.tretiakovdim.runners.classwork.lesson12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by DmitryTretiakov on 09.11.2016.
 */
public class Lesson12StringRunners {
    public static void main(String[] args) {

//        System.out .println ("Enter numbers using comma delimiter");
//        Scanner scanner  = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        System.out .println(inputString.split(" +").length);

//        long start = System.currentTimeMillis();
//        String c = "start";
//        String b = "finish";
//        for (long i = 0; i < 100000L; i++)
//            c = c.concat(b);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start + " String ");
//
//        long startb = System.currentTimeMillis();
//        StringBuilder cc = new StringBuilder("start");
//        String bb = "finish";
//        for (long i = 0; i < 100000L; i++)
//            cc = cc.append(bb);
//        long endb = System.currentTimeMillis();
//        System.out.println(endb - startb + " builder ");

        StringBuilder builder = new  StringBuilder("start");
        builder.append(" new ending");
        System.out.println(builder.toString());

        int startInclusive = 2;
        int endExclusive = 7;
        builder.delete(startInclusive, endExclusive);
        System.out.println(builder.toString());

        int indexOffset = 3;
        builder.insert(indexOffset,"some sub string");
        System.out.println(builder.toString());

         startInclusive = 1;
         endExclusive = 2;

        builder.replace
                (startInclusive, endExclusive,"replace");
        System.out.println(builder.toString());

        int charIndex = 3;

        builder.setCharAt(charIndex, 'a');
        System.out.println(builder.toString());


//С масива чаров в строку
        char[] myCharArray={'1','3','4','5'};
        builder = new StringBuilder("");
        System.out .println(builder.append(myCharArray));

//        for (char value : myCharArray){
//            builder.append(value);
//        }
//полиндром
//        String palindrome = " moom ";
//        builder = new StringBuilder(palindrome);
//        builder.reverse();
//        if (palindrome.equals(builder.toString()))
//            System.out .println(" Palindrome");
//        else
//            System.out .println(" Not palindrome");


    }
}

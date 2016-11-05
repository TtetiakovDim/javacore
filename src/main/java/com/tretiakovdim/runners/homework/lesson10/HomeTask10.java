package com.tretiakovdim.runners.homework.lesson10;

import com.tretiakovdim.app.homework.lesson10.StringHomeWork10;

import java.util.Scanner;

/**
 * Created on 05.11.2016.
 */
public class HomeTask10 {
    public static void main(String[] args) {
        StringHomeWork10 myStringHomeWork10 =new StringHomeWork10();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter string Polindrom : ");
        String polindrom = sc.nextLine();
        System.out.println(" Enter number task Polindrom : ");
        System.out.println(" 1. Definition of a Polindrom  ");
        System.out.println(" 2. Definition of a Polindrom  ");
        System.out.println(" 3. Definition of a Polindrom  ");
        System.out.println(" 4. Definition of a Polindrom  ");
        System.out.println(" 5. Definition of a Polindrom  ");


         try {
//
//            System.out.println(" Your number in this int: " + userNum);
            switch (sc.nextInt()) {
                case 1:
                    if (myStringHomeWork10.checkIfPolindromOne(polindrom)==true) System.out.println(" This string is a palindrome ");
                   else System.out.println(" This string is not palindrome ");
                           break;
                case 2:
                    if (myStringHomeWork10.checkIfPolindromTwo(polindrom)==true) System.out.println(" This string is a palindrome ");
                    else System.out.println(" This string is not palindrome ");
                    break;
                case 3:
                    if (myStringHomeWork10.checkIfPolindromThree(polindrom)==true) System.out.println(" This string is a palindrome ");
                    else System.out.println(" This string is not palindrome ");
                    break;
                case 4:

                    break;
                case 5:
                    break;
            }


        } catch (Exception ex) {
            System.err.println("Input ERROR!");
        } finally {
            sc.close();
        }
    }


}

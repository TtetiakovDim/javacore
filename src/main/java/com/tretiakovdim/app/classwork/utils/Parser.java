package com.tretiakovdim.app.classwork.utils;

import java.util.Scanner;

/**
 * Created by on 19.10.2016.
 */
public class Parser {

    /*public double (String inputData) {
            if(inputData.matches ("\\d")){
            System.out.println("It is number");
          //  int data = Integer.valueOf(inputData);
                double data = Integer.valueOf(inputData);
            }

        if(inputData.matches("\\d+\\.\\d+")){
            System.out.println("It is double");
            double data = Double.valueOf(inputData);

            return data ;
        }
*/
    public void enter() {
        Scanner conin = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers to average.");

// Read and sum numbers.
        while(conin.hasNext()) {
            if(conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
            }
            else {
                String str = conin.next();
                if(str.equals("done")) break;
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }

        System.out.println("Average is " + sum / count);
    }

}

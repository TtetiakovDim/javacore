package com.tretiakovdim.app.classwork.utils;

/**
 * Created by on 19.10.2016.
 */
public class Parser {

    public double (String inputData) {
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



}

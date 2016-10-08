package com.TretiakovDim.app.utils.runners;

/**
 * Created by Стас on 08.10.2016.
 */
public class PrimitiveConvertor{

    public char floatToChar(float float_variable_name ){
        char char_variable_name =(char) float_variable_name;
        System.out.println("Input float value is "+  float_variable_name + ". Output char value is "  + char_variable_name);
        return char_variable_name;
    }
    public char intToChar(int int_variable_name ){
        char char_variable_name =(char) int_variable_name;
        System.out.println("Input int value is "+  int_variable_name + ". Output char value is " + char_variable_name);
        return char_variable_name;
    }
    public int charToInt(char char_variable_name){
        int int_variable_name =(int) char_variable_name;
        System.out.println("Input char value is "+  char_variable_name + ". Output int value is  " + int_variable_name);
        return int_variable_name;
    }
}

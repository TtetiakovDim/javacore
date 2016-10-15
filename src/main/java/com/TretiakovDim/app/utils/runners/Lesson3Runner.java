package com.TretiakovDim.app.utils.runners;

/**
 * Created by Стас on 08.10.2016.
 */

public class Lesson3Runner {

    public static void main(String[] args) {
        PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor( );
        char mychar ='1';
        float myfloat = 49;
        int myint=49;
            MyPrimitiveConvertor.charToInt(mychar);
            MyPrimitiveConvertor.floatToChar(myfloat);
            MyPrimitiveConvertor.intToChar(myint);
    }
}



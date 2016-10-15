package com.TretiakovDim.app.myHomework.lesson4;

import com.TretiakovDim.app.utils.runners.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Стас on 15.10.2016.
 */
public class PrimitiveConvertorText {
@Test

public void convertorText(){
    int a=1,b=2,expRes3=1;char mychar ='1', expRes1='4', expRes2=49; float myfloat = 49; int myint=49;
    
    PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor( );
    Assert.assertEquals(expRes1, MyPrimitiveConvertor.floatToChar(myfloat));
    Assert.assertEquals(expRes2, MyPrimitiveConvertor.intToChar(myint));
    Assert.assertEquals(expRes3, MyPrimitiveConvertor.charToInt(mychar));

}
}

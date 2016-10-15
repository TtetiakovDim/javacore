package com.TretiakovDim.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Стас on 12.10.2016.
 */
public class MathFuncTest {
@Test
    public void multiplyTest(){
    int a=1,b=2,expRes=2;
    MathFunc myMathFunc =new MathFunc();
    Assert.assertEquals(expRes, myMathFunc.multiply(a, b));
}
}

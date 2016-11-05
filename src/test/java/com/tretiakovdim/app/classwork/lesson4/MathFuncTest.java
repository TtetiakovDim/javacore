package com.tretiakovdim.app.classwork.lesson4;

import com.tretiakovdim.app.classwork.lesson4.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created  on 12.10.2016.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.multiply(a, b));
    }
    @Test
    public  void additionTest() {
        int a = 1, b = 2, expRes = 3;
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.addition(a, b));
    }
    @Test
    public  void subtractionTest() {
        int a = 1, b = 2, expRes = -1;
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.subtraction(a, b));
    }
    @Test
    public  void chooseMaxNumberTest() {
        double a = 1d, b = 2d ,expRes = 2;
        double delta = 0.0000001d;
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.chooseMaxNumber(a, b),delta);
    }
    @Test
    public  void getSqurtTest() {
        double a = 4d;
        double expRes = 2d;
        double delta = 0.0000001d;
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.getSqurt(a),delta);
    }
    @Test
    public  void getPowTest() {
        int a = 1, b = 2, expRes = 1;
        double delta = 0.0000001d;
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.getPow(a, b),delta);
    }
    @Test
    public  void isOddNumberTest() {
        int a = 1;
        boolean expRes =true;
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.isOddNumber(a));
    }
}

package com.tretiakovdim.app.homework.lesson5;

import com.tretiakovdim.app.classwork.utils.Calculate;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created  on 05.11.2016.
 */
public class CalculateTest {
    @Test
    public void calCircleAreaTest() {
        Calculate myCalculate= new Calculate();
        double expRes = Math.PI * 4.6d *4.7d;
        Assert.assertEquals (expRes,myCalculate.calCircleArea(4.7d),69.39778171779854d);
    }
    @Test
    public void calculateBiggerTest() {
        Calculate myCalculate= new Calculate();
        boolean expRes = true;
        Assert.assertEquals (expRes,myCalculate.calculateBigger(4.7d,1d));

    }
    @Test
    public void rightAngledTriangleCHeckTest() {
        Calculate myCalculate= new Calculate();
        boolean expRes = true;
        Assert.assertEquals (expRes,myCalculate.rightAngledTriangleCHeck(22.090000000000003d,22.090000000000003d,31.239977592821674d));
    }
    @Test
    public void cHeckOddOrEvenTest() {
        Calculate myCalculate= new Calculate();
        boolean expRes = true;
        Assert.assertEquals (expRes,myCalculate.cHeckOddOrEven(5));
    }
    //    @BeforeClass;


    }


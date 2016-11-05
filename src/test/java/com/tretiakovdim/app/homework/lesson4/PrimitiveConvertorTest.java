package com.tretiakovdim.app.homework.lesson4;

import com.tretiakovdim.app.classwork.utils.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created  on 15.10.2016.
 */
public class PrimitiveConvertorTest {
    @Test

    public void floatToCharTest() {
        char expRes = 49;
        PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor();
        Assert.assertEquals(expRes, MyPrimitiveConvertor.floatToChar(49.999f));
    }

    @Test
    public void intToCharTest() {
        char expRes = 49;
        PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor();
        Assert.assertEquals(expRes, MyPrimitiveConvertor.intToChar(49));
    }

    @Test
    public void charToInt() {
        int expRes = 49;
        PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor();
        Assert.assertEquals(expRes, MyPrimitiveConvertor.charToInt('1'));

    }
}

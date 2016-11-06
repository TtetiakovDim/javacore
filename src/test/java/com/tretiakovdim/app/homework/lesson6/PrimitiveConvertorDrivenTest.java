package com.tretiakovdim.app.homework.lesson6;

import com.tretiakovdim.app.classwork.lesson4.MathFunc;
import com.tretiakovdim.app.classwork.utils.PrimitiveConvertor;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by DmitryTretiakov on 06.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class PrimitiveConvertorDrivenTest {

    @Test
    @FileParameters(value = "src/test/resources/PrimitiveConvertFloatToCharTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public void floatToCharTest(float argA, char expRes) {
        PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor();
        Assert.assertEquals(expRes, MyPrimitiveConvertor.floatToChar(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/PrimitiveConvertIntToCharTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public void intToCharTest(int argA, char expRes) {
        PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor();
        Assert.assertEquals(expRes, MyPrimitiveConvertor.intToChar(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/PrimitiveConvertCharToIntTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public void charToInt(char argA, int expRes) {
        PrimitiveConvertor MyPrimitiveConvertor = new PrimitiveConvertor();
        Assert.assertEquals(expRes, MyPrimitiveConvertor.charToInt(argA));

    }

}

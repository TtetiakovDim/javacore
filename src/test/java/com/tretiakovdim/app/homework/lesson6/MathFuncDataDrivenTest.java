package com.tretiakovdim.app.homework.lesson6;

import com.tretiakovdim.app.classwork.lesson4.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created  on 05.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFuncDataDrivenTest {
    public static final double delta = 0.001;

    @Test
    @FileParameters(value = "src/test/resources/MathMultiplyTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int argA, int argB, int expRes) {
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.multiply(argA,argB));
    }
    @Test
    @FileParameters(value = "src/test/resources/MathAdditionTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public  void additionTest(int argA, int argB, int expRes) {
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.addition(argA, argB));
    }
    @Test
    @FileParameters(value = "src/test/resources/MathSubtractionTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public  void subtractionTest(int argA, int argB, double expRes) {
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.subtraction(argA, argB),delta);
    }
    @Test
    @FileParameters(value = "src/test/resources/MathChooseMaxNumberTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public  void chooseMaxNumberTest(double argA, double argB, double expRes) {
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.chooseMaxNumber(argA, argB),delta);
    }
    @Test
    @FileParameters(value = "src/test/resources/MathGetSqurtTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public  void getSqurtTest(double argA, double expRes) {
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.getSqurt(argA),delta);
    }
    @Test
    @FileParameters(value = "src/test/resources/MathGetPowTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public  void getPowTest(double argA, double argB, double expRes) {
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.getPow(argA, argB),delta);
    }
    @Test
    @FileParameters(value = "src/test/resources/MathisOddNumberTestFile.csv", mapper = CsvWithHeaderMapper.class)
    public  void isOddNumberTest(int argA, boolean expRes) {
        MathFunc myMathFunc = new MathFunc();
        Assert.assertEquals(expRes, myMathFunc.isOddNumber(argA));
    }
}

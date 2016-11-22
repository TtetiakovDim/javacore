package com.tretiakovdim.app.homework.lesson12;

import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DmitryTretiakov on 16.11.2016.
 */
public class CaesarAlgorithmDrivenTest {

    @Test
    @FileParameters(value = "src/test/resources/CaesarAlgorithmTestFile.csv", mapper = CsvWithHeaderMapper.class)

    public void EncryptionCaesarStringTest(String argA, int argB, String argC, String expRes) {
        CaesarAlgorithm myCaesarAlgorithm = new CaesarAlgorithm();
        Assert.assertEquals(expRes, myCaesarAlgorithm.EncryptionCaesarString(argA, argB, argC));
    }
    @Test
    public void DecryptionCaesarStringTest(String argA, int argB, String argC, String expRes) {
        CaesarAlgorithm myCaesarAlgorithm = new CaesarAlgorithm();
        Assert.assertEquals(expRes, myCaesarAlgorithm.DecryptionCaesarString(argA, argB, argC));

    }


}

package com.tretiakovdim.app.homework.lesson12;

import com.tretiakovdim.app.classwork.lesson4.MathFunc;
import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DmitryTretiakov on 16.11.2016.
 */
public class CaesarAlgorithmTest {

//
  public static final double delta = 0.001;
//
//    @Test
//    @FileParameters(value = "src/test/resources/CaesarAlgorithmTestFile.csv", mapper = CsvWithHeaderMapper.class)
//
//    public void EncryptionCaesarStringTest(String argA, int argB, String argC, String expRes) {
//        CaesarAlgorithm myCaesarAlgorithm = new CaesarAlgorithm();


    @Test
    public void EncryptionCaesarStringTest() {
        CaesarAlgorithm myCaesarAlgorithm = new CaesarAlgorithm();
        Assert.assertEquals(" ГЙЗЗЬИ ", myCaesarAlgorithm.EncryptionCaesarString(" АЖЕЕЩЁ ", 3, "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"));
        Assert.assertEquals("", myCaesarAlgorithm.EncryptionCaesarString(" XWZ ", 70, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
    @Test
    public void DecryptionCaesarStringTest() {
        CaesarAlgorithm myCaesarAlgorithm = new CaesarAlgorithm();
        Assert.assertEquals(" АЖЕЕЩЁ ", myCaesarAlgorithm.DecryptionCaesarString(" ГЙЗЗЬИ ", 3, "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"));
        Assert.assertEquals(" XWZ ", myCaesarAlgorithm.DecryptionCaesarString(" AZC ", 3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));

    }

}

package com.tretiakovdim.runners.homework.lesson12;

import com.tretiakovdim.app.homework.lesson12.CaesarAlgorithm;
import com.tretiakovdim.runners.classwork.lesson12.Enigma;

/**
 * Created by DmitryTretiakov on 12.11.2016.
 */
public class CaesarRanner {
    public static void main(String[] args) {


        CaesarAlgorithm myCaesarAlgorithm = new CaesarAlgorithm();
        System.out.printf(myCaesarAlgorithm.EncryptionCaesarString(" АЖЕЕЩЁ ", 3));
        System.out.printf(myCaesarAlgorithm.DecryptionCaesarString(" ГЙЗЗЬИ ", 3));

    }
}
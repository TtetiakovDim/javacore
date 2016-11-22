package com.tretiakovdim.runners.homework.lesson12;

import com.tretiakovdim.app.homework.lesson12.CaesarAlgorithm;
import com.tretiakovdim.runners.classwork.lesson12.Enigma;

import java.util.Scanner;

/**
 * Created by DmitryTretiakov on 12.11.2016.
 * Определять алфавит
 * строчность символов.Перевод регистра.
 * Написать нормальное меню с выходом и повторениями ввода.
 */
public class CaesarRanner {
    public static final String ALPHABET_ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//мощность алфавита 26
    public static final String ALPHABET_RU = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";//мощность алфавита 33

    public static void main(String[] args) {
        CaesarAlgorithm myCaesarAlgorithm = new CaesarAlgorithm();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Caesar encryption algorithm program ");

        String line,key = null;
        System.out.println(" Please enter the key : ");
        key = scanner.nextLine();
        System.out.println(" Please enter the text to encrypt Caesar algotitmom : ");
        line = scanner.nextLine();
        System.out.printf(myCaesarAlgorithm.EncryptionCaesarString(line,Integer.valueOf(key), ALPHABET_RU));

        System.out.println(" Caesar decryption algorithm program ");
        System.out.println(" Please enter the key : ");
        key = scanner.nextLine();
        System.out.println(" Please enter the text to decryption Caesar algotitmom : ");
        line = scanner.nextLine();
        System.out.printf(myCaesarAlgorithm.DecryptionCaesarString(line,Integer.valueOf(key),ALPHABET_RU));
    }
        }
//        System.out.printf(myCaesarAlgorithm.EncryptionCaesarString("МАМА МЫЛА РАМУ 666 РАЗ", 3,ALPHABET_RU));
//        System.out.printf(myCaesarAlgorithm.EncryptionCaesarString("МАМА МЫЛА РАМУ 666 РАЗ", 3,ALPHABET_RU));
//        System.out.printf(myCaesarAlgorithm.DecryptionCaesarString(" ГЙЗЗЬИ ", 70,ALPHABET_RU));
//        System.out.printf(myCaesarAlgorithm.EncryptionCaesarString(" XWZ ", 70,ALPHABET_ENG));
//        System.out.printf(myCaesarAlgorithm.DecryptionCaesarString(" AZC ", 70,ALPHABET_ENG));




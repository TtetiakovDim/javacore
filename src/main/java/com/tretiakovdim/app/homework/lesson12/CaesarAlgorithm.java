package com.tretiakovdim.app.homework.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DmitryTretiakov on 12.11.2016.
Можно добавить чтобы цыфры не шифровались если они есь в строке- придумать область и проверять на входимость
 И конструкторе сделать выбор алфавита .
Сдвиг по маленьким буквам? как быть с ним)
 */

public class CaesarAlgorithm {
    public static final String ALPHABET_ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//мощность алфавита 26
    public static boolean testMessage(String message) {
        Pattern p = Pattern.compile("^[0-9 ]+");
        Matcher m = p.matcher(message);
        return m.matches();
    }
    public static boolean testChar(char elChar) {
        Pattern p = Pattern.compile("^[0-9 ]+");
        Matcher m = p.matcher(String.valueOf(elChar));
//        System.out .println ("  "+m.matches()+": "+String.valueOf(elChar));
        return m.matches();
    }


    public static String EncryptionCaesarString(String message, int KEY,String ALPHABET ) {
        String encryptedMessage = "";
        if(KEY>ALPHABET.length()) {
            System.out .println ("The key is invalid .Please enter a number from 1 to "+ALPHABET.length()+": ");
            return encryptedMessage;
        }
                for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j <ALPHABET.length(); j++) {
                if (ALPHABET.charAt(j) == message.charAt(i)) {
                    encryptedMessage += ALPHABET.charAt((j + KEY) % ALPHABET.length());
                    break;
                }
                if (true == testChar(message.charAt(i))) {
                    encryptedMessage += message.charAt(i);
                    break;
                }
            }
        }
        return encryptedMessage;
    }


    public static String DecryptionCaesarString(String message, int KEY,String ALPHABET) {
        String decryptedMessage = "";
        if(KEY>ALPHABET.length()) {
            System.out .println (" The key is invalid .Please enter a number from 1 to "+ALPHABET.length()+": ");
            return decryptedMessage;
        }
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < ALPHABET.length(); j++) {
                if (ALPHABET.charAt(j) == message.charAt(i)) {

                    decryptedMessage += ALPHABET.charAt(Math.abs((j+ALPHABET.length() - KEY)) % ALPHABET.length());
                    break;
                }
                if (true == testChar(message.charAt(i))) {
                    decryptedMessage += message.charAt(i);
                    break;
                }
            }
        }
        return decryptedMessage;
    }
}
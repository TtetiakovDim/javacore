package com.tretiakovdim.app.homework.lesson12;

import static com.tretiakovdim.runners.classwork.lesson12.Enigma.DOMAIN;

/**
 * Created by DmitryTretiakov on 12.11.2016.
 */
public class CaesarAlgorithm {
    public static final String ALPHABET_ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//мощность алфавита 26
    public static final String ALPHABET_RU = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";//мощность алфавита 36

    public static String EncryptionCaesarString(String message, int KEY) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < ALPHABET_RU.length(); j++) {
                if (ALPHABET_RU.charAt(j) == message.charAt(i)) {
//                    encryptedMessage += ALPHABET_RU.charAt((j + KEY) % 26);
                    encryptedMessage += ALPHABET_RU.charAt((j + KEY) % 36);

                    break;
                }
                if (' ' == message.charAt(i)) {
                    encryptedMessage += message.charAt(i);
                    break;
                }
            }
        }

        return encryptedMessage;
    }

    public static String DecryptionCaesarString(String message, int KEY) {
        String decryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < ALPHABET_RU.length(); j++) {
                if (ALPHABET_RU.charAt(j) == message.charAt(i))  {
                    decryptedMessage += ALPHABET_RU.charAt((j - KEY) % 36);
                    break;
                }
                if (' ' == message.charAt(i)) {
                    decryptedMessage +=message.charAt(i);
                    break;
                }


            }
        }
        return decryptedMessage;
    }

}
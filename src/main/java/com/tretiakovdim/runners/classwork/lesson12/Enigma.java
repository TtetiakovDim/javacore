package com.tretiakovdim.runners.classwork.lesson12;

/**
 * Created by DmitryTretiakov on 09.11.2016.
 */
public class Enigma {
    //    public static final char[] DOMAIN = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
//    public static final char[] CODE = {'0', '9', '8', '7', '6', '5', '4', '3', '2', '1', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final String DOMAIN = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 ";
    public static final String KEY =    " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String EncryptionEnigmaString(String message, String KEY) {
        String encryptedMessage = "";


        for (int i = 0; i < message.length(); i++) {
//        StringBuilder builder = new  StringBuilder(message);
            for (int j = 0; j < DOMAIN.length(); j++) {
                if (DOMAIN.charAt(j) == message.charAt(i)) {
                    encryptedMessage += KEY.charAt(j);
                    break;
                }
            }
        }
        return encryptedMessage;
    }

    public static String DecryptionEnigmaString(String encryptedMessage, String KEY) {
        String decryptedMessage = "";
        for (int i = 0; i < encryptedMessage.length(); i++) {
            for (int j = 0; j < KEY.length(); j++) {
                if (KEY.charAt(j) == encryptedMessage.charAt(i)) {
                    decryptedMessage += DOMAIN.charAt(j);
                    break;
                }
            }
        }
        return decryptedMessage;
    }

}
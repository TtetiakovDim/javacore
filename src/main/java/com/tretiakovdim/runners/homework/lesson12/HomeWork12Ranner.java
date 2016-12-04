package com.tretiakovdim.runners.homework.lesson12;

import com.tretiakovdim.app.homework.lesson12.ArrayParser;
import com.tretiakovdim.app.homework.lesson12.CaesarAlgorithm;
import com.tretiakovdim.app.homework.lesson9.LoopsArraysHomeWork9;
import com.tretiakovdim.runners.classwork.lesson12.Enigma;

import java.util.Arrays;

/**
 * Created by DmitryTretiakov on 19.11.2016.
 */

public class HomeWork12Ranner {
    public static void main(String[] args) {
        ArrayParser arrayParser = new ArrayParser();
        LoopsArraysHomeWork9 arraySort = new LoopsArraysHomeWork9();
//        System.out.println(Arrays.asList(arrayParser.stringToInt("1 2 3 4 5 6 7 8 9 "," ")));

        boolean doAgain = true;
        do {
            System.out.println("Please, select num ");
            System.out.println("1.Sort numbers from a string with separators");
            System.out.println("2.Extract alphabet letters from a string with comma separators");
            System.out.println("3. Not work Print a string separated by keyword split into lines");
            System.out.println("4.Encrypt and Decrypt your message using Enigma algorithm");
            System.out.println("5.Encrypt and Decrypt your message using Caesar algorithm");
            System.out.println("0.Exit");
            switch (arrayParser.stringRead()) {
                case "1":
                    System.out.println("Please enter numbers to sort separated by semicolon:");
                    int[] array = arrayParser.stringToInt(arrayParser.stringRead(), " ");
                    System.out.println("Choose direction to sort the array.");
                    System.out.println("Enter \"1\" to sort from smaller to bigger.");
                    System.out.println("Enter \"2\" to sort from bigger to smaller.");
                    switch (arrayParser.stringRead().toLowerCase()) {
                        case "1":
//                            System.out.println(Arrays.asList((arraySort.LoopsArraysSortBubbleMaxToMin(array))));
                            break;
                        case "2":
//                            System.out.println(Arrays.asList((arraySort.LoopsArraysSortBubbleMinToMax(array))));
                            break;
                        default:
                            System.out.println("There is no such a sorting order.");
                    }
                    break;
                case "2":
                    System.out.println("Please enter a string using comma as separator.");
                    String enterLineAlphabet = arrayParser.stringRead();
                    System.out.println(Arrays.asList(arrayParser.stringToAlphabet(enterLineAlphabet, " ")));
                    break;
                case "3":
                    System.out.println("Enter a keyworld");
                    String separator = arrayParser.stringRead();
                    System.out.println("Enter a string.");
                    String[] enterLine = arrayParser.stringRead().split(" ");

                    for (String i : enterLine) {
                        if (i != separator) System.out.print(i + " ");
                    }

                    break;
                case "4":
                    Enigma enigma = new Enigma();
                    System.out.println("Enter your message.");
                    String encodedString = enigma.EncryptionEnigmaString(arrayParser.stringRead(), Enigma.KEY);
                    System.out.println("Encrypt message: " + encodedString);
                    System.out.println("Decrypt message: " + enigma.DecryptionEnigmaString(encodedString, Enigma.KEY));
                    break;
                case "5":
                    CaesarAlgorithm caesar = new CaesarAlgorithm();
                    System.out.println("Enter your message.");
                    encodedString = caesar.EncryptionCaesarString(arrayParser.stringRead(), 10, CaesarAlgorithm.ALPHABET_ENG);
                    System.out.println("Encrypt message: " + encodedString);
                    System.out.println("Decrypt message: " + caesar.DecryptionCaesarString(arrayParser.stringRead(), 10, CaesarAlgorithm.ALPHABET_ENG));
                    break;
                case "0":
                    doAgain = false;
                    break;
                default:
                    System.out.println("Try again");
            }
        } while (doAgain);
    }
}


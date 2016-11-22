package com.tretiakovdim.app.homework.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.io.File.separator;
import static java.lang.System.out;

/**
 * Created by DmitryTretiakov on 19.11.2016.
 */
public class ArrayParser {

    public static int[] stringToInt(String enterLine, String separator) {
StringBuilder builder = new StringBuilder("");
        out .println(builder.append(enterLine));

        String strArr[] = enterLine.split(separator);
        int numArray[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArray[i] = Integer.parseInt(strArr[i]);
             out.print(numArray[i]);
        }
        return numArray;
    }

    public static int[] stringToIntOne(String enterLine, String separator) {
        int numArray[] = Arrays.stream(enterLine.split(separator)).mapToInt(Integer::parseInt).toArray();
        return numArray;
    }

    public static String stringToAlphabet(String enterLine, String separator) {
        String stringsAlphabet="";
        for (int i = 0; i < enterLine.length(); i++) {
                if (true == testChar(enterLine.charAt(i))) {
                    stringsAlphabet += enterLine.charAt(i);
                    break;
                }
            }
               return stringsAlphabet;
    }

        public static String stringRead() {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            return string;
        }
    public static boolean testChar(char elChar) {
        Pattern p = Pattern.compile("^[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]+");
        Matcher m = p.matcher(String.valueOf(elChar));
        return m.matches();
    }


        public static String[] consoleToStringArray (String exitWord) {
            String input;
            ArrayList<String> arrayList = new ArrayList();
            boolean doAgain = true;
            do {
                out.println("Enter a line. Type \"" + exitWord + "\" to stop adding lines and save to file.");
                input = stringRead();
                if (input.equals(exitWord)) {
                    break;
                }
                arrayList.add(input);
            } while (true);
            return arrayList.toArray(new String[arrayList.size()]);
        }


    }

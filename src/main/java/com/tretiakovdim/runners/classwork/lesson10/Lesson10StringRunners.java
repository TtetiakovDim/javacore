package com.tretiakovdim.runners.classwork.lesson10;

/**
 * Created  on 02.11.2016.
 */
public class Lesson10StringRunners {

    public static String charToString(char[] charArray) {

        String myString = "";

        for (char call : charArray) {

            myString = myString + call;
        }
        return myString;
    }

    public static boolean checkIfPolindromOne(String palindrom) {

        boolean isPolindrom = false;
        for (int i = 0; i < palindrom.length() / 2; i++) {
            if (palindrom.charAt(i) == palindrom.charAt(palindrom.length() - 1 - i)) {
                isPolindrom = true;
            } else return false;

        }
        return true;
    }
    public static boolean checkIfPolindromTwo(String palindrom) {
String copyString="";
        boolean isPolindrom = false;
        for (int i = palindrom.length()-1; i>=0 ; i--) {
            copyString=copyString+palindrom.charAt(palindrom.length() - 1 - i);

        }

        if (palindrom.equals(copyString)){return true;} else return false ;
    }
    public static void main(String[] args) {

        char inArrays[] = {'1', '2', '2', '3', '5', '6', '8', '0', '9', '3'};

        charToString(inArrays);
        System.out.println(inArrays);
        boolean value = true;
        String myBoolValue = String.valueOf(value);
        String palindrom = "MOOM";

    }
}

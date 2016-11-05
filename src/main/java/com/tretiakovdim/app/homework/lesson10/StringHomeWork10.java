package com.tretiakovdim.app.homework.lesson10;

/**
 * Created  on 05.11.2016.
 */
public class StringHomeWork10 {

    public static boolean checkIfPolindromOne(String palindrom) {

           for (int i = 0; i < palindrom.length() / 2; i++) {
            if (palindrom.charAt(i) == palindrom.charAt(palindrom.length() - 1 - i)) {

            } else return false;

        }
        return true;
    }
    public static boolean checkIfPolindromTwo(String palindrom) {
        String copyString="";
                for (int i = palindrom.length()-1; i>=0 ; i--) {
            copyString=copyString+palindrom.charAt(palindrom.length() - 1 - i);

        }

        if (palindrom.equals(copyString)){return true;} else return false ;
    }

    public static boolean checkIfPolindromThree(String palindrom) {
//        replaceAll("\\W",""): убираем из строки все не нужные символы (знаки препинания, пробелы и т.д.);
//        new StringBuilder: создаем вторую строку, но пересортированную в обратном порядке с помощью метода reverse();
//        equalsIgnoreCase: сравниваем их между собой, игнорируя регистр.
//        palindrom = palindrom.replaceAll("\\W","");//удаляем все ненужное
//        StringBuilder strBuilder = new StringBuilder(palindrom);
//        strBuilder.reverse(); //переворачиваем строку
//        String invertedText = strBuilder.toString();//присваиваем перевернутую строку
//        return palindrom.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра

        return palindrom.replaceAll("\\W", "").equalsIgnoreCase(new StringBuilder(palindrom.replaceAll("\\W", "")).reverse().toString());

    }

    public static boolean checkIfPolindromFour(String palindrom) {
//        replaceAll("\\W",""): убираем из строки все не нужные символы (знаки препинания, пробелы и т.д.);
//        new StringBuilder: создаем вторую строку, но пересортированную в обратном порядке с помощью метода reverse();
//        equalsIgnoreCase: сравниваем их между собой, игнорируя регистр.

        return palindrom.replaceAll("\\W", "").equalsIgnoreCase(new StringBuilder(palindrom.replaceAll("\\W", "")).reverse().toString());
    }

}

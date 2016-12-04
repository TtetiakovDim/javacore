package com.tretiakovdim.app.homework.lesson13;

import com.tretiakovdim.app.homework.lesson10.StringHomeWork10;
import com.tretiakovdim.app.homework.lesson9.LoopsArraysHomeWork9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.io.File.separator;

/**
 * Created by DmitryTretiakov on 16.11.2016.
 * Домашнее задание будет состоять из нескольких этапов:
 * 1.Реализовать чтение из файла строк с массивами чисел, разделенными запятыми, и их сортировку с последующей записью в другой файл.
 * Для чтения файла и записи в файл создать вспомогательные классы и/или методы.
 * <p>
 * 2. Реализовать программу, которая считывает из файла список слов в стобик, и выводит в другой файл список слов и признак полиндромности
 * в виде “moom is polindrome”.
 * <p>
 * 3.Реализовать программу, которая при запуске запрашивает у пользователя имя файла и затем запрашивает у пользователя текст,
 * считывая его построчно с консоли и сохраняя в файл. При вводе комбинации символов *exit* программа сохраняет все введенные строки
 * в файл и завершает свою работу.
 */
public class FileExperiments {


    public int[] stringToIntArray(String fileLine, String separator) {

        String strArr[] = fileLine.split(separator);

        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            // System.out.println(numArr[i]);
        }
        return numArr;
    }




    public String intArrayToString(int[] numArr, String separator) {
        String line = "";
        for (int i = 0; i < numArr.length; i++) {
            line += String.valueOf(numArr[i]) + separator;
        }
//        System.out.println(line);
        return line;
    }

    public static ArrayList<String> myReaderFiles(String fileName) {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String fileLine;
            ArrayList<String> strArr = new ArrayList();

            while ((fileLine = reader.readLine()) != null) {
                strArr.add(fileLine);

            }
            reader.close();
            return strArr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            System.out.println("Regardless about exception");
            return null;
        }

    }


    public void myFileWriterArrayToFile(String fileName, ArrayList<String> strArr) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
            for (String writeString:strArr) {
                writer.append(writeString);
                writer.newLine();
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception");
        }
    }

}






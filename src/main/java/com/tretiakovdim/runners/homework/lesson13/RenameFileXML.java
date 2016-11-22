package com.tretiakovdim.runners.homework.lesson13;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by DmitryTretiakov on 12.11.2016.
 * Домашнее задание будет состоять из нескольких этапов:
 * Реализовать чтение из файла строк с массивами чисел, разделенными запятыми, и их сортировку с последующей записью в другой файл. Для чтения файла и записи в файл создать вспомогательные классы и/или методы.
 * Реализовать программу, которая считывает из файла список слов в стобик, и выводит в другой файл список слов и признак полиндромности в виде “moom is polindrome”.
 * Реализовать программу, которая при запуске запрашивает у пользователя имя файла и затем запрашивает у пользователя текст, считывая его построчно с консоли и сохраняя в файл. При вводе комбинации символов *exit* программа сохраняет все введенные строки в файл и завершает свою работу.
 * **Написать программу, которая создает properties file и считывает с консоли данные, введенные пользователем в формате ключ и его значение, разделенное запятой. Например “dbname, localhost”. При вводе пустой строки - программа сохраняет все данные в файл и затем выводит ключи и значения c разделителем в виде “=”, например “dbname=localhost”. Более подробно - https://www.mkyong.com/java/java-properties-file-examples/
 * Создать раннеры для каждого ДЗ. Создать меню для запуска каждого пункта из каждого ДЗ. Все раннеры назвать как Hometask{номер домашней работы} и поместить в package runners.
 */
public class RenameFileXML {

    public static void main(String[] args) {
        String searchID = args[0];
        String replaceID = args[1];
        String filePath = args[2];
        System.out.println(searchID + " : " + replaceID+" : "+filePath);
//        String searchID = "38537963";
//        String replaceID = "38537963_";
//        String currentDir = System.getProperty("user.dir");
//        Charset charset = StandardCharsets.UTF_16;
        Path path;

        File[] filesList;
//        File filesPath = new java.io.File("C:\\1\\"); // создаем объект на папку с файлами
        File filesPath = new java.io.File(filePath);
        filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File

        for (int i = 0; i < filesList.length; i++) {
            String buf = filesList[i].getName(); // читаем текущее имя файла
            if (buf.endsWith(".XML") && buf.contains(searchID) == true) {  // если заканчивается на .xml, то меняем на имя и содержимое
                path = Paths.get("C:\\1\\" + buf);

                try {
                    Files.write(path,
                            new String(Files.readAllBytes(path), "windows-1251").replace(searchID, replaceID)
                                    .getBytes("windows-1251"));

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("elements of the path: " + buf);
                buf = buf.replaceFirst(searchID, replaceID);
//                buf =buf.replaceAll("[\\s]{2,}", "").trim();
                filesList[i].renameTo(new File("C:\\1\\" + buf));


            }
        }
    }

}



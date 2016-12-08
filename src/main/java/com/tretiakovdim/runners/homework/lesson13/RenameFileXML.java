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
 */
public class RenameFileXML {

    public static void main(String[] args) {
        String searchID = args[0];
        String replaceID = args[1];
        String currentDir = System.getProperty("user.dir")+System.getProperty("file.separator");

//        String filePath = args[2];
        System.out.println("" + searchID + " replaced by " + replaceID + " : in "+currentDir);
//        String searchID = "38537963";
//        String replaceID = "38537963_";

//        Charset charset = StandardCharsets.UTF_16;
        Path path;
        File[] filesList;
//        File filesPath = new java.io.File("C:\\1\\"); // создаем объект на папку с файлами
        File filesPath = new java.io.File(currentDir);
        filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File

        for (int i = 0; i < filesList.length; i++) {
            String buf = filesList[i].getName(); // читаем текущее имя файла
            if (buf.endsWith(".XML") && buf.contains(searchID) == true) {  // если заканчивается на .xml, то меняем на имя и содержимое
                path = Paths.get(currentDir + buf);

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
                filesList[i].renameTo(new File(currentDir + buf));


            }
        }
    }

}



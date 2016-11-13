package com.tretiakovdim.runners.homework.lesson13;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by DmitryTretiakov on 12.11.2016.
 */
public class RenameFileXML {

    public static void main(String [] args){

        File[] filesList;
        File filesPath = new java.io.File("C:\\1\\"); // создаем объект на папку с файлами

        filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File

        for(int i=0; i<filesList.length; i++){
            String buf = filesList[i].getName(); // читаем текущее имя файла
            if(buf.endsWith(".XML")){  // если заканчивается на .txt, то меняем на .java



                buf = buf.replaceFirst("38537963", "38537963_");
                filesList[i].renameTo(new File("C:\\1\\"+buf));

                try {
                RandomAccessFile f = new RandomAccessFile(filesList[i].getName(), "rw");
                long length = f.length() - 1;
                do {
                    length -= 1;
                    f.seek(length);
                    byte b = f.readByte();
                } while(b != 10);
                f.setLength(length+1);
                f.close();

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }



            }
        }

//        java.io.File file = new java.io.File("D:\\test.txt"); // создаем объект на файл test.txt
//        if(file.exists()){ // если файл существует, то переименовываем его
//            file.renameTo(new java.io.File("D:\\main.java"));
//        }
//        else{
//            System.out.println("File not found!");
        }



    }



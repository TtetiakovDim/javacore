package com.tretiakovdim.runners.classwork.lesson13;

import com.tretiakovdim.app.homework.lesson10.StringHomeWork10;

import java.io.*;

/**Состояне и поведение state behavior
 * Created by DmitryTretiakov on 12.11.2016.
 */
public class MyFileReader {


    //    public static void (String path){
//    throw IOException{
//
//        }
//
//    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        String currentDir = System.getProperty("user.dir");
        String linuxStyle = "dir/somefile.txt";
        String windowsStyle = "dir\\somefile.txt";
        File file = new File(currentDir, linuxStyle);
        System.out.println(file.getAbsolutePath());
        file = new File(currentDir, windowsStyle);
        System.out.println(file.getAbsolutePath());



        BufferedReader reader;
        BufferedWriter writer;
        StringHomeWork10 myStringHomeWork10 = new StringHomeWork10();
        try {
            reader = new BufferedReader(new FileReader("src/test/resources/InFile.txt"));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/test/resources/OutFile.txt")));
            String polindrom;


            while ((polindrom = reader.readLine()) != null) {

                if (myStringHomeWork10.checkIfPolindromThree(polindrom) == true) {
                    polindrom = polindrom.concat(" - polindrom ");

                }else {polindrom = polindrom.concat(" - not polindrom ");}
                System.out.println(polindrom);
                writer.append( polindrom);
                writer.newLine();

            }
            reader.close();
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
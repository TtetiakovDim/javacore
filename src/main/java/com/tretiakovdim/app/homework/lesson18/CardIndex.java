package com.tretiakovdim.app.homework.lesson18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class CardIndex {

    //    public static ArrayList<String> cSVReade(String fileName) {
//
//        String csvFile = "/Users/mkyong/csv/country.csv";
//        String line = "";
//        String cvsSplitBy = ",";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//
//            while ((line = br.readLine()) != null) {
//
//                // use comma as separator
//                String[] country = line.split(cvsSplitBy);
//
//                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
    public static ArrayList<UniversityPerson> filesReader(String fileName) {
        String cvsSplit = "|";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String fileLine;
            ArrayList<UniversityPerson> arrayPerson = new ArrayList<UniversityPerson>();
            Students students;
            Employees employees;

            boolean firstLine = true;
            while ((fileLine = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] parsLine = fileLine.trim().split("[,|;:.!?\\s]+");
                if (parsLine[0].equals("Students")) {
                    students = new Students(parsLine[1], parsLine[2], parsLine[3], parsLine[4], parsLine[5], parsLine[6]);
                    arrayPerson.add(students);
                }
                if (parsLine[0].equals("Employees")) {
                    employees = new Employees(parsLine[1], parsLine[2], parsLine[3], parsLine[4], parsLine[5]);
                    arrayPerson.add(employees);

                }
            }
            reader.close();
            return arrayPerson;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}
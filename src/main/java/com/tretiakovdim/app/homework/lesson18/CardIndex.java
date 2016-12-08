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

    public void infoSearch(ArrayList<UniversityPerson> list, String searchKey, Integer key) {
        String nameClass;
        Students students = new Students();
        Employees employees = new Employees();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).infoCheck(1, searchKey) == true) {
                nameClass = list.get(i).getClass().getName();
//                if (nameClass.toLowerCase().contains("Students".trim().toLowerCase())) {
//                   students=(students)list.get(i);
//                }
                System.out.println(list.get(i).getCart() + " " + list.get(i).infoCheck(key, searchKey) + list.get(i).getClass().getName());
            }
        }
        System.out.println("search done");
    }


    public ArrayList<UniversityPerson> filesReader(String fileName) {
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
                    System.out.println(parsLine[1]+parsLine[2]+ parsLine[3]+ parsLine[4]+ parsLine[5]+ parsLine[6]);
                    System.out.println(students.getCart()) ;
                }
                if (parsLine[0].equals("Employees")) {
                    employees = new Employees(parsLine[1], parsLine[2], parsLine[3], parsLine[4], parsLine[5]);
                    System.out.println(employees.getCart()) ;


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
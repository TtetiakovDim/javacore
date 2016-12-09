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


    public void printCardIndex(ArrayList<UniversityPerson> list) {
        String nameClass;
        String[] parsLine;
        System.out.printf("%-11s%-11s%-11s%-11s%-11s%-15s%-11s%n", "Person", "Surname ", "Name", "Faculty", "Status", "YearOfStudy", " Function");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {

            nameClass = list.get(i).getClass().getSimpleName();
            if (nameClass.toLowerCase().contains("Students".trim().toLowerCase())) {
                parsLine = list.get(i).getCart().trim().split("[,|;:.!?\\s]+");
                System.out.printf("%-11s%-11s%-11s%-11s%-17s%-11s%n", list.get(i).getClass().getSimpleName(), parsLine[1], parsLine[2], parsLine[3], parsLine[4], parsLine[5]);
            }
            if (nameClass.toLowerCase().contains("Employees".trim().toLowerCase())) {
                parsLine = list.get(i).getCart().trim().split("[,|;:.!?\\s]+");
                System.out.printf("%-11s%-11s%-11s%-11s%-27s%-11s%n", list.get(i).getClass().getSimpleName(), parsLine[1], parsLine[2], parsLine[3], " ", parsLine[4]);
            }

        }
    }

    public void infoSearch(ArrayList<UniversityPerson> list, String searchKey, Integer key) {
        String nameClass;
        String[] parsLine ;
        System.out.printf("%-11s%-11s%-11s%-11s%-11s%-15s%-11s%n", "Person", "Surname ", "Name", "Faculty", "Status", "YearOfStudy"," Function");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).infoCheck(key, searchKey) == true) {
                nameClass = list.get(i).getClass().getSimpleName();

                if (nameClass.toLowerCase().contains("Students".trim().toLowerCase())) {
                    parsLine = list.get(i).getCart().trim().split("[,|;:.!?\\s]+");
//                    System.out.println(list.get(i).getClass().getSimpleName() + list.get(i).getCart());
                    System.out.printf("%-11s%-11s%-11s%-11s%-17s%-11s%n", list.get(i).getClass().getSimpleName(), parsLine[1], parsLine[2], parsLine[3], parsLine[4], parsLine[5]);
                }
                if (nameClass.toLowerCase().contains("Employees".trim().toLowerCase())) {
                    parsLine = list.get(i).getCart().trim().split("[,|;:.!?\\s]+");
//                    System.out.println(list.get(i).getClass().getSimpleName() + list.get(i).getCart());
                    System.out.printf("%-11s%-11s%-11s%-11s%-27s%-11s%n", list.get(i).getClass().getSimpleName(), parsLine[1], parsLine[2], parsLine[3]," ", parsLine[4]);
                }





            }
        }
        System.out.println("");
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
                }
                if (parsLine[0].equals("Employees")) {
                    employees = new Employees(parsLine[1], parsLine[2], parsLine[3], parsLine[4], parsLine[5]);
//                    System.out.println(employees.getCart());
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
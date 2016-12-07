package com.tretiakovdim.app.homework.lesson19;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.tretiakovdim.app.homework.lesson18.Employees;
import com.tretiakovdim.app.homework.lesson18.Students;
import com.tretiakovdim.app.homework.lesson18.UniversityPerson;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by DmitryTretiakov on 05.12.2016.
 */
//Our variable:
//        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
//        To store:
//        map.put("mango", new ArrayList<Integer>(Arrays.asList(0, 4, 8, 9, 12)));
//        To add numbers one and one, you can do something like this:
//        String key = "mango";
//        int number = 42;
//        if (map.get(key) == null) {
//        map.put(key, new ArrayList<Integer>());
//        }
//        map.get(key).add(number);
//        In Java 8 you can use putIfAbsent to add the list if it did not exist already:
//        map.putIfAbsent(key, new ArrayList<Integer>());
//        map.get(key).add(number);
//
//        Use the map.entrySet() method to iterate on:
//        for (Entry<String, List<Integer>> ee : map.entrySet()) {
//        String key = ee.getKey();
//        List<Integer> values = ee.getValue();
//        }

public class PhoneBook {
    Map<String, ArrayList<PhoneBookEntry>> category = new HashMap<String, ArrayList<PhoneBookEntry>>();
    private ArrayList<PhoneBookEntry> entryArrayList;
    private String categoryPhoneBookEntry;
    private ArrayList<PhoneBookEntry> entry;

    public void addCategoryToPhoneBook(String nameCategory) {
//       Проверка на наличие
        this.category.put(nameCategory, new ArrayList<PhoneBookEntry>());
    }

    public void addEntryToPhoneBook(String nameCategory, String name, String phoneNumber) {
        //       Проверка на наличие
        this.category.get(nameCategory).add(new PhoneBookEntry(name, phoneNumber));
    }

    public void renameCategoryPhoneBook(String name, String phoneNumber) {
//Проверка на наличие контакта
    }

    public void renameEntryToPhoneBook(String nameCategory, String name, String phoneNumber) {
        //       Проверка на наличие
    }

    public void deleteCategoryPhoneBook(String nameCategory) {
//       Проверка на наличие
        this.category.remove(nameCategory);
    }

    public void deleteEntryPhoneBook(String nameCategory) {
//       Проверка на наличие
        this.category.remove(nameCategory);
    }

    public boolean checkCategoryPhoneBook(String nameCategory) {
        if (this.category.containsKey(nameCategory)) return true;
        else return false;
    }

    public boolean checkEntryPhoneBook(String nameCategory, String entry) {
        if (this.category.get(nameCategory).isEmpty()) {
            System.out.println(this.category.get(nameCategory).isEmpty());
            return false;

        } else return true;
    }


    public void printCategoryList() {
        for (String name : category.keySet()) {
            String key = name.toString();
            String value = category.get(name).toString();
            System.out.println(key + " " + value);

        }
    }

    public void printEntryInCategoryList(String nameCategory) {
//Проверка на наличие

        if (checkCategoryPhoneBook(nameCategory)) {
            if (this.category.get(nameCategory).isEmpty() == false) {
                System.out.println(" " + this.category.get(nameCategory).get(0).getName());
                for (int i = 0; i < this.category.get(nameCategory).size(); i++) {
                    System.out.println("" + category.get(nameCategory).toString() + ": Name : " + this.category.get(nameCategory).get(i).getName() + " : Phone number :" + this.category.get(nameCategory).get(i).getPhoneNumber());
                }
            }
        }
    }


    public void Search(String searchKey) {

        for (String nameKey : category.keySet()) {

            for (int i = 0; i < this.category.get(nameKey.toString()).size(); i++) {
                if (this.category.get(nameKey.toString()).get(i).checkNameOrPhoneNumber(1, searchKey) == true) {
                    System.out.println(" : Category : " + nameKey + " : Name : " + this.category.get(nameKey.toString()).get(i).getName() + " : PhoneNumber : " + this.category.get(nameKey.toString()).get(i).getPhoneNumber());
                }
                if (this.category.get(nameKey.toString()).get(i).checkNameOrPhoneNumber(2, searchKey) == true) {
                    System.out.println(" : Category : " + nameKey + " : Name : " + this.category.get(nameKey.toString()).get(i).getName() + " : PhoneNumber : " + this.category.get(nameKey.toString()).get(i).getPhoneNumber() + " :");
                }
            }
//            System.out.println("search done");
        }
    }

    public boolean readFilesToPhoneBook(String fileName) {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String fileLine;
            boolean firstLine = true;

            while ((fileLine = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] parsLine = fileLine.trim().split("[,|;:.!\\s]+");
                this.category.put(parsLine[0], new ArrayList<PhoneBookEntry>());
            }
            reader.close();

            reader = new BufferedReader(new FileReader(fileName));
            firstLine = true;

            while ((fileLine = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] parsLine = fileLine.trim().split("[,|;:.!\\s]+");
                this.category.get(parsLine[0]).add(new PhoneBookEntry(parsLine[1] + " " + parsLine[2], parsLine[3] + " " + parsLine[4]));
//                System.out.println(parsLine[0] + " " + parsLine[1] + " " + parsLine[3]);
            }
            reader.close();

            return false;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;

        } catch (IOException e) {
            Logger.getLogger(PhoneBook.class.getName())
                    .log(Level.SEVERE, null, e);
            e.printStackTrace();
            return false;
        }

    }

    public void phoneBookWriteTofiles(String fileName) {
        BufferedWriter writer;
        String fileLine;
        boolean firstLine = true;

//        bw.write(System.lineSeparator());

    }



}

















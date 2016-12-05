package com.tretiakovdim.runners.homework.lesson19;

import com.tretiakovdim.app.homework.lesson19.PhoneBook;
import com.tretiakovdim.app.homework.lesson19.PhoneBookEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * Created by DmitryTretiakov on 05.12.2016.
 */
public class PhoneBookRanner19 {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Map<String, ArrayList<PhoneBookEntry>> category = new HashMap<String, ArrayList<PhoneBookEntry>>();
        phoneBook.filesToPhoneBookReader("src/test/resources/PhoneBook.csv");

        phoneBook.addCategoryToPhoneBook("Frend");
        phoneBook.addEntryToPhoneBook("Frend", "Lev", "7777777");
        phoneBook.addCategoryToPhoneBook("NotFrend");
        phoneBook.addEntryToPhoneBook("NotFrend", "NotLev", "7777777");

        phoneBook.addEntryToPhoneBook("NotFrend", "kolz", "7777777788");
        phoneBook.addEntryToPhoneBook("NotFrend", "Noev", "777777766");
        phoneBook.addEntryToPhoneBook("NotFrend", "NtL", "777777787");
        phoneBook.addEntryToPhoneBook("NotFrend", "tLev", "7777777565");
        phoneBook.Search("kol");
        //phoneBook.deleteCategoryPhoneBookEntry("NotFrend");
        phoneBook.printEntryInCategoryList("NotFrend");
        phoneBook.printCategoryList();

//        list1.add(new PhoneBookEntry("Ivan1", "7777"));
//        category.put("1",new ArrayList<PhoneBookEntry>());
//         list1.add(new PhoneBookEntry("Ivan2", "55555"));
//        category.put("2", list1);
//        list2.add(new PhoneBookEntry("Ivan3", "88888"));
//        category.put("3", list2);
//        list2.add(new PhoneBookEntry("Ivan4", "777776"));
//        category.put("4", list2);
//        category.get("1").add(new PhoneBookEntry("Ivan5", "5777776"));
//        category.get("4").add(new PhoneBookEntry("Ivan5", "5777776"));
//        for (Map.Entry entry : category.entrySet()) {
//            System.out.println(entry.getKey() + ", " + entry.getValue().toString());
//
//        }
//
//        for (String name : category.keySet()) {
//
//            String key = name.toString();
//            String value = category.get(name).toString();
//
//            System.out.println(key + " " + value);
//        }


    }
}

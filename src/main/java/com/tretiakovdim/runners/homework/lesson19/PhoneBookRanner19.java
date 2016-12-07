package com.tretiakovdim.runners.homework.lesson19;

import com.tretiakovdim.app.homework.lesson19.PhoneBook;
import com.tretiakovdim.app.homework.lesson19.PhoneBookEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

import static com.tretiakovdim.runners.homework.lesson17.GuessingRunner17.checkMenu;
import static com.tretiakovdim.runners.homework.lesson17.GuessingRunner17.userInput;

/**
 * Created by DmitryTretiakov on 05.12.2016.
 */

public class PhoneBookRanner19 {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Map<String, ArrayList<PhoneBookEntry>> category = new HashMap<String, ArrayList<PhoneBookEntry>>();
        String menuItem, incomingPhone, incomingString,incomingCategore;
        phoneBook.readFilesToPhoneBook("src/test/resources/PhoneBook.csv");
        phoneBook.addCategoryToPhoneBook("NotFrend");
        phoneBook.addEntryToPhoneBook("NotFrend", "tLev", "7777777565");

        //phoneBook.deleteCategoryPhoneBookEntry("NotFrend");

//        if (phoneBook.checkCategoryPhoneBook(incomingString)){
//else {
//                System.out.println("This category is not available, add it? ");
//                System.out.println("1. Yes  ");
//                System.out.println("2. Not ");
//                menuItem = userInput();
//
//                if (checkMenu(menuItem)) {
//                    if (menuItem.contains("1")) {
//                        phoneBook.addCategoryToPhoneBook(incomingString);
//                        System.out.println(" Contact created ");
//                    }
//                    if (menuItem.contains("2")) {}
//
//                    else{ System.out.println("This category is not available, add it? ");


        System.out.println("My Phone book. ");
        boolean again = true;
        do {
            phoneBook.printCategoryList();

            System.out.println("1. Enter the category ");
            System.out.println("2. Add the new category  ");
            System.out.println("3. Rename the category ");
            System.out.println("4. Delete the category ");
            System.out.println("5. Search by phone number or name(Search by all)");
            System.out.println("6. Exit.");

            menuItem = userInput();
//Подменю начало
            if (checkMenu(menuItem)) {
//1 ---------------------------------------------------------------------------------------------------------
                if (menuItem.contains("1")) {
                    System.out.println("Enter a category name ");
                    incomingCategore = userInput();


                    do {
                        if (phoneBook.checkCategoryPhoneBook(incomingCategore)) {

                            phoneBook.printEntryInCategoryList(incomingCategore);
                            again = false;
                            System.out.println("      Contact list ");
                            System.out.println("1. Add contact  ");
                            System.out.println("2. Rename contact  ");
                            System.out.println("3. Delete contact  ");
                            System.out.println("9. Back to the list category");
                            System.out.println(" ");

                            menuItem = userInput();

                            if (checkMenu(menuItem)) {
                                if (menuItem.contains("1")) {
                                    System.out.println(" Enter a new contact  ");
                                    incomingString = userInput();
                                    if (phoneBook.checkEntryPhoneBook(incomingCategore,incomingString)==false){
                                        System.out.println(" Enter phone  ");
                                        incomingPhone= userInput();
                                        phoneBook.addEntryToPhoneBook(incomingCategore,incomingString,incomingPhone);
                                        System.out.println(" Contact created ");
                                    }


                                }
                                if (menuItem.contains("2")) {
                                    System.out.println("Enter a contact to rename ");

                                    incomingCategore = userInput();
                                    System.out.println(" Enter a new name for contact ");
                                    System.out.println(" contact rename ");
                                    System.out.println(" ");
                                }
                                if (menuItem.contains("3")) {
                                    System.out.println("Enter a contact name to delete");
                                    incomingCategore = userInput();
                                    System.out.println("Contact delete");
                                    System.out.println(" ");

                                }
                                if (menuItem.contains("9")) {
                                    System.out.println(" ");
                                    again = true;
                                }
                            } else System.out.println("Not correct, ente 1 or 9.  ");


                        } else {
                            System.out.println("This category is not available, add it? ");
                            System.out.println("1. Yes  ");
                            System.out.println("7. Not ");
                            menuItem = userInput();
                            if (checkMenu(menuItem)) {
                                if (menuItem.contains("1")) {
                                    phoneBook.addCategoryToPhoneBook(incomingCategore);
                                    System.out.println(" Category add  ");
                                    again = false;
                                }
                            }
                        }

                    } while (again != true);
                }
//1----------------------------------------------------------------------------------------------------------------

                if (menuItem.contains("2")) {
                    System.out.println("Enter a new category name ");
                    incomingCategore = userInput();
                    if (phoneBook.checkCategoryPhoneBook(incomingCategore) == false) {
                        phoneBook.addCategoryToPhoneBook(incomingCategore);
                        System.out.println(" Category created ");
                        System.out.println(" ");
                    }
                    System.out.println("This category is available and not Add ");
                }
                if (menuItem.contains("3")) {
                    System.out.println("Enter a new category name");
                    incomingCategore = userInput();
                    System.out.println(" Category rename ");
                    System.out.println(" ");
                }
                if (menuItem.contains("4")) {
                    System.out.println("Enter a category name to delete");
                    incomingCategore = userInput();
                    if (phoneBook.checkCategoryPhoneBook(incomingCategore) == true) {
                        phoneBook.deleteCategoryPhoneBook(incomingCategore);
                        System.out.println("Category delete");
                        System.out.println(" ");
                    } else {
                        System.out.println("This category is not available and not delete.");
                    }

                }
                if (menuItem.contains("5")) {
                    System.out.println("Enter an expression for search");
                    incomingString = userInput();
                    phoneBook.Search(incomingString);
                    System.out.println(" ");
                }
                if (menuItem.contains("6")) {
                    System.out.println("Bye");
                    again = false;
                }

            } else System.out.println("Not correct, ente 1 or 9.  ");
// Подменю конець
        }
        while (again);


    }
}

package com.tretiakovdim.runners.homework.lesson18;

import com.tretiakovdim.app.homework.lesson17.Company;
import com.tretiakovdim.app.homework.lesson17.Menu;
import com.tretiakovdim.app.homework.lesson18.CardIndex;
import com.tretiakovdim.app.homework.lesson18.Students;
import com.tretiakovdim.app.homework.lesson18.UniversityPerson;
import com.tretiakovdim.runners.classwork.lesson14.Student;

import java.util.ArrayList;

import static com.tretiakovdim.runners.homework.lesson17.GuessingRunner17.checkMenu;
import static com.tretiakovdim.runners.homework.lesson17.GuessingRunner17.userInput;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class CardIndexRanner18 {


    public static void main(String[] args) {
        ArrayList<UniversityPerson> list = new ArrayList<>();
        CardIndex cardIndex = new CardIndex();
        String menuItem, searchKey;
        list = cardIndex.filesReader("src/test/resources/CardIndex.csv");

        cardIndex.printCardIndex(list);
        System.out.println(" ");
        System.out.println("                       Search for University of card index. ");
        boolean again = true;
        do {

            System.out.println("1. Search by surname ");
            System.out.println("2. Search by name  ");
            System.out.println("3. Search by faculty ");
            System.out.println("4. Search by status ");
            System.out.println("5. Search by yearOfStudy");
            System.out.println("6. Search by function ");
            System.out.println("7. Search by all.");
            System.out.println("8. Print the index card.");
            System.out.println("9. Exit.");

            menuItem = userInput();
            if (checkMenu(menuItem)) {
                if (menuItem.contains("1")) {
                    System.out.println("Enter an expression for search");
                    searchKey = userInput();
                    cardIndex.infoSearch(list, searchKey, 1);
                    System.out.println(" ");
                }
                if (menuItem.contains("2")) {
                    System.out.println("Enter an expression for search");
                    searchKey = userInput();
                    cardIndex.infoSearch(list, searchKey, 2);
                    System.out.println(" ");
                }
                if (menuItem.contains("3")) {
                    System.out.println("Enter an expression for search");
                    searchKey = userInput();
                    cardIndex.infoSearch(list, searchKey, 3);
                    System.out.println(" ");
                }
                if (menuItem.contains("4")) {
                    System.out.println("Enter an expression for search");
                    searchKey = userInput();
                    cardIndex.infoSearch(list, searchKey, 4);
                    System.out.println(" ");

                }
                if (menuItem.contains("5")) {
                    System.out.println("Enter an expression for search");
                    searchKey = userInput();
                    cardIndex.infoSearch(list, searchKey, 5);
                    System.out.println(" ");
                }
                if (menuItem.contains("6")) {
                    System.out.println("Enter an expression for search");
                    searchKey = userInput();
                    cardIndex.infoSearch(list, searchKey, 6);
                    System.out.println(" ");
                }
                if (menuItem.contains("7")) {
                    System.out.println("Enter an expression for search");
                    searchKey = userInput();
                    cardIndex.infoSearch(list, searchKey, 7);
                    System.out.println(" ");
                }
                if (menuItem.contains("8")) {
                    cardIndex.printCardIndex(list);
                    System.out.println(" ");
                }
                if (menuItem.contains("9")) {
                    System.out.println("Bye");
                    again = false;
                }

            } else System.out.println("Not correct, ente 1 or 9.  ");

        }
        while (again);


    }

}


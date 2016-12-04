package com.tretiakovdim.app.homework.lesson17;

import com.tretiakovdim.app.homework.lesson12.ArrayParser;

/**
 * Created by DmitryTretiakov on 26.11.2016.
 */
public class Lesson17Runner {
    public static void main(String[] args) {
        ArrayParser arrayParser = new ArrayParser();

        boolean again = true;
        System.out.println("Please, select A B C D E ");
        System.out.println("D - Exit");
        Menu menu;
        do {

            try {
                menu = Menu.valueOf(arrayParser.stringRead());
                switch (menu) {
                    case A:{
                        System.out.println("You have entered "+menu.toString());
                        break;}
                    case B:
                        System.out.println("You have entered "+menu.toString());
                        break;
                    case C:
                        System.out.println("You have entered "+menu.toString());
                        break;
                    case E:
                        System.out.println("You have entered "+menu.toString());
                        break;
                    case D:
                        System.out.println("You have entered "+menu.toString());
                        again = false;
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Not correct ");
            }

        } while (again);
    }
}
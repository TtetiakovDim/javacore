package com.tretiakovdim.runners.homework.lesson17;

import com.tretiakovdim.app.homework.lesson12.ArrayParser;
import com.tretiakovdim.app.homework.lesson17.Guessing;
import com.tretiakovdim.app.homework.lesson17.Menu;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.menu;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 * Клас фактори как работает разобрать патерн,сплит стринг
 */
public class GuessingRunner17 {
    static int currentYear;

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
    public static Integer userInputInt() {
        Scanner scanner = new Scanner(System.in);
        try {
        Integer string = scanner.nextInt();

            return string;

        } catch (IllegalArgumentException e) {
            System.out.println("Not correct, ente 1 or 9.  ");
            return 0;
        }
        }
    public static boolean checkMenu(String menuItem){
        Pattern p = Pattern.compile("^[0-9]{1}$");
        Matcher m = p.matcher(menuItem);
        return m.matches();

    }


    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
//        Date = calendar.get(Calendar.DAY_OF_MONTH);
//        Month = calendar.get(Calendar.MONTH);
        currentYear = calendar.get(Calendar.YEAR);
        int numberOfAttempts = 0;
        int currentAge,gameRaund=0;

        boolean again = true;
        Random randNumPerson = new Random();
        Guessing[] person = Guessing.values();
        Guessing randomPerson;
        Menu menu;
        System.out.println(" Game - Guess the age of the person. ");


        do {
            try {
                System.out.println("");
                System.out.println("N - New game.  ");
                System.out.println("E - Exit.");

                menu = Menu.valueOf(userInput());
                switch (menu) {
                    case N: {
                        do {
                            do {
                                randomPerson = person[randNumPerson.nextInt(person.length)];
                            } while (randomPerson.isPlayPosition());

                            randomPerson.setPlayPosition(true);
                            currentAge = currentYear - randomPerson.getYearOfBirth();
                            System.out.println(" How old  " + currentAge + randomPerson.getFullName() + " ?");

                            if (currentYear - randomPerson.getYearOfBirth() == Integer.parseInt(userInput())) {
                                numberOfAttempts++;
                                System.out.println(" You guessed , congratulations !!! ");

                                System.out.println(" This man alive? (YES / NOT) " + randomPerson.isRip());

                                if (randomPerson.isRip().equalsIgnoreCase(userInput())) {
                                    System.out.println("Super) You guessed , congratulations !!! ");
                                    if (numberOfAttempts == 3) {
                                        System.out.println(" You win, congratulations !!! ");
                                        break;
                                    }
                                } else {
                                    System.out.println(" Not true ");
//                                    System.out.println(" Not true ,game over.");
//                                    break;
                                }

                            } else {
                                System.out.println(" Not true  ");
//                                System.out.println(" Not true ,game over ");
//                                break;
                            }
                            gameRaund++;
                            System.out.println("Played "+gameRaund+" raundoy of "+person.length);

                        } while (person.length!=gameRaund);
                        if (numberOfAttempts<3) System.out.println(" Game Over (");
                        System.out.println("Guess the name "+numberOfAttempts +", played raundoy "+gameRaund);
                        break;

                    }
                    case E:
                        System.out.println("Bay Bay");
                        again = false;
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Not correct, ente N or E.  ");

            }
        } while (again);
    }
}

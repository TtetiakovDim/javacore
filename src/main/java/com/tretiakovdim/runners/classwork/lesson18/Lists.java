package com.tretiakovdim.runners.classwork.lesson18;

import com.tretiakovdim.app.homework.lesson12.ArrayParser;
import com.tretiakovdim.app.homework.lesson17.Guessing;
import com.tretiakovdim.app.homework.lesson17.Menu;

import java.util.*;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class Lists {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> wordList = new ArrayList<String>();
        String str1 = "abc";
        String word;
        arrayList.add(str1);
        String str2 = "aa";
        arrayList.add(str2);
        int theSize = arrayList.size();

        int index = arrayList.indexOf(str1);
        Collections.sort(arrayList);
        boolean isIn = arrayList.contains(str2);
        System.out.println("Collections" + arrayList);

        Collections.reverse(arrayList);
        System.out.println("Collections" + arrayList.toString());
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        System.out.println(" Game - Guess the age of the person. ");
        System.out.println("D - Exit");

        do {
            word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            wordList.add(word);
        } while (true);





//        HashSet hashSet= new HashSet(wordList);
//
//        System.out.println("Word List " + wordList);
//        System.out.println("Word List " + hashSet);



    }

}

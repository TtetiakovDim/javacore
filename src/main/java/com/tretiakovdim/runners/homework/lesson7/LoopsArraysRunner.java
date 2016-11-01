package com.tretiakovdim.runners.homework.lesson7;

import com.tretiakovdim.app.homework.lesson7.LoopsArrayshomework7;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by on 22.10.2016.
 */
public class LoopsArraysRunner {
    public static void main(String[] args) throws IOException {
        LoopsArrayshomework7 MyLoopsArrayshomework7 = new LoopsArrayshomework7();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Задача - массив из всех чётных чисел от 2 до 20.");
        System.out.println("2.Задача - массив из всех нечётных чисел от 1 до 99. ");
        System.out.println("3.Задача - массив из 15 случайных целых чисел из отрезка [0;9]. ");
        System.out.println("4.Задача - массив из 15 случайных целых чисел из отрезка [0;999].");
        System.out.println("5.Задача - двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].");
        System.out.println("6.Задача - из lesson 7 ");
        System.out.println("7.Задача - двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [1;999].");
        System.out.println("8.Задача - Запросить у пользователя ввести ряд чисел c вводом по одному через Enter");
        System.out.println("9.Выход");

        String line = null;
        /**while ((line = scanner.nextLine()) != "9") {
            if (line.equals("9")) break;
            if (line.equals("1")) MyLoopsArrayshomework7.LoopsArraysTaskOne();
            if (line.equals("2")) MyLoopsArrayshomework7.LoopsArraysTaskTwo();
            if (line.equals("3")) MyLoopsArrayshomework7.LoopsArraysTaskTree();
            if (line.equals("4")) MyLoopsArrayshomework7.LoopsArraysTaskFour();
            if (line.equals("6")) MyLoopsArrayshomework7.LoopsArraysTaskSix();
            if (line.equals("7")) MyLoopsArrayshomework7.LoopsArraysTaskSeven();
            if (line.equals("8")) MyLoopsArrayshomework7.LoopsArraysTaskEight();
        }**/
        switch (scanner.nextLine()) {
            case "1":
                MyLoopsArrayshomework7.LoopsArraysTaskOne();
                break;
            case "2":
                MyLoopsArrayshomework7.LoopsArraysTaskTwo();
                break;
            case "3":
                MyLoopsArrayshomework7.LoopsArraysTaskTree();
                break;
            case "4":
                MyLoopsArrayshomework7.LoopsArraysTaskFour();
                break;
            case "5":
                break;
            case "6":
                MyLoopsArrayshomework7.LoopsArraysTaskSix();
                break;
            case "7":
                MyLoopsArrayshomework7.LoopsArraysTaskSeven();
                break;
        }
    }
}
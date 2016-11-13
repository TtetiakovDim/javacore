package com.tretiakovdim.app.homework.lesson7;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by on 22.10.2016.
 */
public class LoopsArraysHomeWork7 {


    public void LoopsArraysTaskOne() {
//        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя
//        один элемент от другого пробелом, а затем в столбик(отделяя один элемент от другого началом новой строки).
        int inArrays[] = new int[10];
        //System.out.println(inArrays.length+" ");
        for (int i = 0, j = 0; i < inArrays.length; i++) {
            inArrays[i] = j += 2;
        }
        for (int i = 0; i < inArrays.length; i++) System.out.print(" " + inArrays[i]);
        System.out.println(" ");
        for (int i = 0; i < inArrays.length; i++) System.out.println(" " + inArrays[i]);

    }

    public void LoopsArraysTaskTwo() {
//        Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив
//        выведите на экран в другую строку, но в обратном порядке(99 97 95 93 … 7 5 3 1)
        int inArrays[] = new int[50];
        //System.out.println(inArrays.length+" ");
        for (int i = 0, j = -1; i < inArrays.length; i++) {
            inArrays[i] = j += 2;
            System.out.print(" " + inArrays[i]);
        }
        System.out.println(" ");
        for (int i = 49; i > 0; i--) System.out.print(" " + inArrays[i]);
        System.out.println(" ");
    }

    public void LoopsArraysTaskTree() {
//        Создайте массив из 15 случайных целых чисел из отрезка[0; 9].Выведите массив на экран.Подсчитайте сколько
//        в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        int inArrays[] = new int[15];

        for (int i = 0; i < inArrays.length; i++) {
            inArrays[i] = (int) (Math.random() * 9);
            System.out.print(" " + inArrays[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < inArrays.length; i++) {
            if (inArrays[i] % 2 == 0) System.out.println("Четное число : " + inArrays[i]);

        }
    }

    public void LoopsArraysTaskFour() {
//        Создайте массив из 15 случайных целых чисел из отрезка[0; 999].Выведите массив на экран.Выведите минимальное
//        и максимальное значение элементов массива
        int inArrays[] = new int[15];
        int max = 0, min = 999;
        for (int i = 0; i < inArrays.length; i++) {
            inArrays[i] = (int) (Math.random() * 999);
            System.out.print(" " + inArrays[i]);
        }
        System.out.println(" ");

        for (int i = 0; i < inArrays.length; i++) {
            if (inArrays[i] > max) max = inArrays[i];
            if (inArrays[i] < min) min = inArrays[i];

        }
        System.out.println(" Max число : " + max);
        System.out.println(" Min число : " + min);


    }

    public void LoopsArraysTaskFife() {
    }

    public void LoopsArraysTaskSix() {
//        Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка[1; 999].
//        Вывести массив на экран в виде матрицы, где в каждом столбце числа должны быть выравнены по правому краю столбца
        int inArrays[][] = new int[8][5];
        //System.out.print(" "+ Arrays.deepToString(inArrays));

        for (int i = 0; i < inArrays.length; i++) {
            for (int j = 0; j < inArrays[i].length; j++) {
                inArrays[i][j] = (int) (Math.random() * 89 + 10);

                //System.out.print(" i="+i+" j="+j+ " "+inArrays[i][j]);
            }
        }
        System.out.print(" " + Arrays.deepToString(inArrays));

    }

    public void LoopsArraysTaskSeven() {
//        Запросить у пользователя ввести ряд чисел c вводом по одному через Enter (запрашиваем число - ввел
//        число - Enter - запрашиваем следующее).Ввод должен прерываться словом “exit”,о чем нужно сообщить
//        пользователю.После этого вывести сумму всех введенных пользователем чисел.

        int inArrays[][] = new int[8][5];
        //System.out.print(" "+ Arrays.deepToString(inArrays));
        for (int i = 0; i < inArrays.length; i++) {
            for (int j = 0; j < inArrays[i].length; j++) {
                inArrays[i][j] = (int) (Math.random() * 999 + 1);

                System.out.printf("%7d", +inArrays[i][j]);
            }
        }
        System.out.print(" " + Arrays.deepToString(inArrays));
        System.out.println(" ");
    }

    public void LoopsArraysTaskEight() {
//        Запросить у пользователя ввести ряд чисел c вводом по одному через Enter (запрашиваем число - ввел
//        число - Enter - запрашиваем следующее).Ввод должен прерываться словом “exit”,о чем нужно сообщить
//        пользователю.После этого вывести сумму всех введенных пользователем чисел.
        int inArrays[] = new int[10];
        int summ = 0;
        System.out.println(" Введите чисела : ");
        Scanner scanner = new Scanner(System.in);
        String line = null;
        for (int i = 0; i < inArrays.length; i++) {


            //if (scanner.equals("exit")) break;
            System.out.print("Введите число " + i + " ");
            if (scanner.equals("enter")) break;
            inArrays[i] = scanner.nextInt();
            //inArrays[i] =  scanner.nextInt();
        }
        System.out.println(" ");

        for (int i = 0; i < inArrays.length; i++) {
            summ = inArrays[i] + summ;
        }
        System.out.println(" Сумма чисел : " + summ);
    }
}


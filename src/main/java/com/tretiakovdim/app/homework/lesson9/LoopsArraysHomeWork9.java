package com.tretiakovdim.app.homework.lesson9;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created  on 22.10.2016.
 */
public class LoopsArraysHomeWork9 {

    public int[] FillingArraysInt(int lengthArray) {
        Random random = new Random();
        int array[] = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public int[][] FillingTwoArraysInt(int lengthArrayOne, int lengthArrayTwo) {
        Random random = new Random();
        int array[][] = new int[lengthArrayOne][lengthArrayTwo];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(199) - 99;
            }
        }
//        for ( int i = 0; i < lengthArrayOne * lengthArrayTwo; i++ ) array[i / lengthArrayOne][i % lengthArrayOne] = ( i / lengthArrayOne ) * ( i % lengthArrayOne );
        System.out.println(Arrays.deepToString(array));
        return array;
    }

    public int SearchMaximalElement(int array[][]) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) max = array[i][j];
            }
        }
        return max;
    }

    public void IndexMassiva(int array[], int nums) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == nums) {

                System.out.println("Index of your number in this array is: [" + i + "] ");
                break;
            }
            if (i == array.length) {
                System.err.println("There is no match in the array!");
                break;
            }
        }
    }


    public boolean notInArray(int array[][], int random) {


        return true;

    }

    public void TaskMultiplicationmulTable(int lengthArray, int WidthArray) {
//        Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок
//        с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди
//        них не должны повторяться.В помощь учителю напишите программу, которая будет выводить на экран 15
//        случайных примеров из таблицы
//        умножения(от 2*2д о 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).При этом среди 15
//        примеров не должно быть повторяющихся(примеры 2*3и 3*2и им подобные пары считать повторяющимися)
//
//        Random random = new Random();
//        int array[][] = new int[lengthArray][WidthArray];
//        System.out.println(" " + array.length);
//        System.out.println(" " + array[WidthArray].length);
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = random.nextInt(9) + 1;
//
////                if (j == array[i].length - 1) {
//                    array[i][j] = array[i][j - 2] * array[i][j - 1];
//
//                //Проверим, нет ли среди уже свормированых заданий (строк), таких, которые по условиям задачи нельзя задавать другому ученику. Для этого переберем все результаты умножения (3 элементы) предыдущих строк.
////                    for (int k = 0; k < i; k++) {
////                        if (array[i][j] == array[k][j] && i > 0) {
//                            //Если мы нашли такую строку, надо убедиться, что множители в ней тоже совпадают. Для этого нам достаточно проверить совпадение одного множителя.
////                            if (array[i][j - 1] == array[k][j - 1] || array[i][j - 2] == array[j][k - 2])
//                                //Если мы находим такое совпадение - заполним элементы строки заново
////                                --i;
////                        }
////                    }
//
//
//                }
//            }
//
////
////        for(int i=0;i<array.length;i++){
////            System.out.print("Задание №"+(i+1+" Умножить "));
////            for(int j=0;j<array[i].length;j++){
////                if(j==0)
////                    System.out.print(array[i][j]+" на ");
////                if(j==1)
////                    System.out.println(array[i][j]);
////            }
////        }
        int [][] Mas = new int[15][3];
        for(int i =0;i<Mas.length;i++){
            for(int h=0;h<Mas[i].length;h++){
                //Первым двум элементам строки (множителям) присвоим рандомные значения от 2 до 9
                Mas[i][h]=(int)(Math.random()*8)+2;
                //3 элемент - это результат умножения первых двух элементов строки
                if(h==Mas[i].length-1){
                    Mas[i][h]=Mas[i][h-2]*Mas[i][h-1];
                    //Проверим, нет ли среди уже свормированых заданий (строк), таких, которые по условиям задачи нельзя задавать другому ученику. Для этого переберем все результаты умножения (3 элементы) предыдущих строк.
                    for(int q=0;q<i;q++){
                        if(Mas[i][h]==Mas[q][h]&&i>0){
                            //Если мы нашли такую строку, надо убедиться, что множители в ней тоже совпадают. Для этого нам достаточно проверить совпадение одного множителя.
                            if(Mas[i][h-1]==Mas[q][h-1]||Mas[i][h-2]==Mas[q][h-2])
                                //Если мы находим такое совпадение - заполним элементы строки заново
                                --i;
                        }
                    }
                }
            }
        }
        //С помощью простого цикла выведем уже отобранные задания на экран
        for(int i=0;i<Mas.length;i++){
            System.out.print("Задание №"+(i+1+" Умножить "));
            for(int h=0;h<Mas[i].length;h++){
                if(h==0)
                    System.out.print(Mas[i][h]+" на ");
                if(h==1)
                    System.out.println(Mas[i][h]);

            }
        }
    }




    public String LoopsArraysTask(int lengthArray) {
        char inArrays[] = new char[lengthArray];
        for (int i = 0, j = 0; i < inArrays.length; i++) {
            inArrays[i] = (char) i;
        }
        String myString = Arrays.toString(inArrays);
        System.out.println(" Arrays \n " + myString);
        return myString;
    }


    public int[] LoopsArraysSortBubbleMaxToMin(int array[]) {
        int a = 0, k = 0, j = 0;
        do {
            j = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    k = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = k;
                    j = 1;
                }
            }
        } while (j > 0);
        return array;
    }

    public int[] LoopsArraysSortBubbleMinToMax(int array[]) {
        int a = 0, k = 0, j = 0;
        do {
            j = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    k = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = k;
                    j = 1;
                }
            }
        } while (j > 0);
        return array;
    }

    public int[] LoopsArraysSortSelection(int array[]) {
        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;

        }
        return array;
    }

    public void arrayPrint(int array[]) {
        System.out.println(Arrays.toString(array));
    }
}




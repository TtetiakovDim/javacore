package com.tretiakovdim.runners.homework.lesson9;

import com.tretiakovdim.app.homework.lesson7.LoopsArrayshomework7;
import com.tretiakovdim.app.homework.lesson9.LoopsArraysHomeWork9;

import java.util.Scanner;

/**
 * Created  30.10.2016.
 * Домашнее задание будет состоять из нескольких этапов:
 * Переделать все меню в runners с конструкций if-then-else на switch-case
 * Выполнить задачи:
 * Написать класс для пузырьковой сортировки с 2 методами, которые будут на входе при вызове принимать одномерный массив int. Один метод должен сортировать от меньшего числа к большему, второй - наоборот. Методы должны возвращать также одномерный массив int. Входной и результирующий массивы вывести классом ArrayPrint (который вы создадите для вывода массивов) результат выводится на экран раннером.
 * ** Выполнить сортировку массива методом Selection sort
 * ** Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).
 * ** Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них не должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты). При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
 */
public class Homework9Runner {
    public static void main(String[] args) {

        LoopsArraysHomeWork9 MyLoopsArrayshomework = new LoopsArraysHomeWork9();

        System.out.println(" Sort ");
        //System.out.println("9.Выход");
        MyLoopsArrayshomework.arrayPrint(MyLoopsArrayshomework.LoopsArraysSortBubbleMaxToMin(MyLoopsArrayshomework.FillingArraysInt(15)));
        MyLoopsArrayshomework.arrayPrint(MyLoopsArrayshomework.LoopsArraysSortBubbleMinToMax(MyLoopsArrayshomework.FillingArraysInt(15)));
        MyLoopsArrayshomework.arrayPrint(MyLoopsArrayshomework.LoopsArraysSortSelection(MyLoopsArrayshomework.FillingArraysInt(15)));
        System.out.println(" " + MyLoopsArrayshomework.SearchMaximalElement(MyLoopsArrayshomework.FillingTwoArraysInt(5, 8)));
//        MyLoopsArrayshomework.TablOffElement(15);

        System.out.println(" Enter int: ");
        Scanner sc = new Scanner(System.in);
        try {
            int userNum = sc.nextInt();

                    System.out.println(" Your number in this int: " + userNum);
            MyLoopsArrayshomework.IndexMassiva(MyLoopsArrayshomework.FillingArraysInt(10),userNum);

        } catch ( Exception ex ) {
            System.err.println("Input ERROR!");
        } finally {
            sc.close();
        }
    }


    }

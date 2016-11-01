package com.tretiakovdim.app.homework.lesson9;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by on 22.10.2016.
 */
public class LoopsArraysHomeWork9 {

    public int[] FillingArraysInt(int lengthArray) {
        Random random = new Random();
        // Scanner scanner = new Scanner(System.in);
        int array[] = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            //  System.out.println(random.nextInt(31) - 15);
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

    public void LoopsArraysTask() {
        char inArrays[] = new char[256];
        //System.out.println(inArrays.length+" ");
        for (int i = 0, j = 0; i < inArrays.length; i++) {
            inArrays[i] = (char) i;
        }
        String myString = Arrays.toString(inArrays);
        System.out.println(" Arrays \n " + myString);
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




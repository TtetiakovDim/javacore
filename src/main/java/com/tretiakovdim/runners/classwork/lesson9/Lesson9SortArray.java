package com.tretiakovdim.runners.classwork.lesson9;

import java.util.Arrays;

/**
 * Created  30.10.2016.
 */
public class Lesson9SortArray {

    public static void main(String[] args) {

        int[] array = {5, 4, 2, 1, 3};

        System.out.println(Arrays.toString(array));

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

        System.out.println(Arrays.toString(array));

    }


}

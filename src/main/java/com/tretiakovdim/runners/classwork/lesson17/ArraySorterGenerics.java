package com.tretiakovdim.runners.classwork.lesson17;

import java.security.PublicKey;

/**
 * Created by DmitryTretiakov on 30.11.2016.
 */
public class ArraySorterGenerics<T extends Number> {
    private T[] t;

    public ArraySorterGenerics(T[] t) {
        this.t = t;
    }


    public T[] arrraySort() {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        T temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < t.length - 1; j++) {
                if (t[j].doubleValue() < t[j + 1].doubleValue())   // change to > for ascending sort
                {
                    temp = t[j];                //swap elements
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
        return t;
    }

    public static <T extends Number> T[] arraySort(T[] array){
        ArraySorterGenerics<T> sorterGenerics= new ArraySorterGenerics<T>(array);
        return sorterGenerics.arrraySort();
    }

    public static void main(String[] args) {
        Integer[] integers=new Integer[5];
    for (int i=0;i<integers.length;i++){
        integers[i]=100-1;
    }
        System.out.println(integers);
    ArraySorterGenerics<Integer> arraySorterGenerics = new ArraySorterGenerics<>(integers);
    Integer[] sort = arraySorterGenerics.arrraySort();

        System.out.println(ArraySorterGenerics.arraySort(sort));
    }

}
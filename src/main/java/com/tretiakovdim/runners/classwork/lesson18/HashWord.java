package com.tretiakovdim.runners.classwork.lesson18;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class HashWord {
    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        hashSet.add("a");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("R");
        hashSet.add("D");
        hashSet.add("  ");
        hashSet.add(" G");

        System.out.println(""+hashSet);
//      hashSet  не сортирует

        TreeSet treeSet=new TreeSet(hashSet);
        System.out.println(" "+treeSet);




    }

}

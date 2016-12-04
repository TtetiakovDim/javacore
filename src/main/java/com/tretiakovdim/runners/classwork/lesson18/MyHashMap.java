package com.tretiakovdim.runners.classwork.lesson18;

import java.util.HashMap;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class MyHashMap {
    public static void main(String[] args) {
        HashMap hashMap =new HashMap();
        hashMap.put("Zara","8");
        hashMap.put("Mahnaz",1);
        hashMap.put("Ayan","2");
        hashMap.put("Xxx","2");
        System.out.println(""+ hashMap);


        System.out.println(""+ hashMap.get("Zara"));
    }

}

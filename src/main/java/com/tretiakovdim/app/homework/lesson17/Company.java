package com.tretiakovdim.app.homework.lesson17;

import java.util.Arrays;

/**
 * Created by DmitryTretiakov on 26.11.2016.
 */
public enum Company {
    EBAY(30, "Ebay Inc"), GOOGLE(15, "Google Inc");


    private int value;
    private String fullName;

    //    abstract void getR();
    private Company(int value, String fullName) {
        this.fullName = fullName;
        this.value = value;
    }

    int getRevenue() {
        return 66666;
    }

    int getValue() {
        return value;
    }

    public static void main(String[] args) {


        for (Company cName : Company.values()) {
            System.out.println("Company Value - " + cName.getValue() + "- Company name " + cName);


            Arrays.asList(Company.values()).forEach(company ->

                    System.out.println("Company name: " + company.name() + " revenue:" + company.getRevenue()));

        }
    }


    //Ctrl alt V
}

//public enum Company {
//
//    EBAY("EBAY") {
//        @Override
//        int getRevenue() { return 66666;
//        }
//    },
//
//    GOOGLE("GOOGLE") {
//        @Override
//        int getRevenue() { return 777777;
//
//        }
//
//    };
//
//    String name;
//    Company(String name) {
//        this.name = name;
//    }
//    abstract int getRevenue();
//}
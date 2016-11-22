package com.tretiakovdim.runners.homework.lesson14;

import com.tretiakovdim.app.homework.lesson14.WhiteCollar;

/**
 * Created by DmitryTretiakov on 18.11.2016.
 */
public class Homework14OopRunner {


    public static void main(String[] args) {
        WhiteCollar whiteCollar = new WhiteCollar(121, "Ivan", "Intel_#");

        whiteCollar.setCompany("mi");
        whiteCollar.setAge(21);
        System.out.println(" Company name:"+whiteCollar.companyName+"; Name:"+whiteCollar.getName()+"; Age:"+whiteCollar.getAge()+";");


    }

}

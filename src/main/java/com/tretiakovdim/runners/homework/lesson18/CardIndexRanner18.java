package com.tretiakovdim.runners.homework.lesson18;

import com.tretiakovdim.app.homework.lesson18.CardIndex;
import com.tretiakovdim.app.homework.lesson18.Students;
import com.tretiakovdim.app.homework.lesson18.UniversityPerson;
import com.tretiakovdim.runners.classwork.lesson14.Student;

import java.util.ArrayList;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class CardIndexRanner18 {


    public static void main(String[] args) {
ArrayList<UniversityPerson> list=new ArrayList<>();
    CardIndex cardIndex=new CardIndex();

//        System.out.println(arrayList.toString());

        list= cardIndex.filesReader("src/test/resources/CardIndex.csv");
        System.out.println(list.toString());

    }

}

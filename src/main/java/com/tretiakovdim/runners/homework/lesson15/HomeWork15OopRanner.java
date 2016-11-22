package com.tretiakovdim.runners.homework.lesson15;

import com.tretiakovdim.app.homework.lesson15.BicycleWithRing;
import com.tretiakovdim.app.homework.lesson15.CustomBicycle;

import javax.swing.*;

/**
 * Created by DmitryTretiakov on 22.11.2016.
 */
public class HomeWork15OopRanner {
    public static void main(String[] args) {
                BicycleWithRing bicycleWithRing = new BicycleWithRing();
        CustomBicycle customBicycle= new CustomBicycle();

        bicycleWithRing.ring();
        customBicycle.setGear(2);
        customBicycle.setSpeed(5);
        customBicycle.ride();


//Action a= (Action) customBicycle;

    }

}

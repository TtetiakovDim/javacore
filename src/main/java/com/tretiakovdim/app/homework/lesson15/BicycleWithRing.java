package com.tretiakovdim.app.homework.lesson15;

/**
 * Created by DmitryTretiakov on 22.11.2016.
 */
public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {


    @Override
    public void ring() {
        System.out.println("Di-ling!");
    }

    public void ring(int x) {
        System.out.println(x);
    }
}

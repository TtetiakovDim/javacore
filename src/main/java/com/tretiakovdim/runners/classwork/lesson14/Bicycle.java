package com.tretiakovdim.runners.classwork.lesson14;

/**
 * Created by DmitryTretiakov on 16.11.2016.
 */
public class Bicycle {
int diameter,frameSize;
String color,breakType;

public  Bicycle(int diameter,int frameSize,String color,String breakType){
    this.diameter=diameter;
    this.color=color;
    this.breakType=breakType;
    this.frameSize=frameSize;

    }
    public  Bicycle(){
        this.diameter=26;
        this.color="Red";
        this.breakType="disk";
        this.frameSize=50;
    }
    public  Bicycle(int diametr){
        this();
        this.diameter=26;


    }

}

package com.tretiakovdim.app.homework.lesson15;

/**
 * Created by DmitryTretiakov on 22.11.2016.
 */
public class CustomBicycle extends Bicycle {
   private int speed;
    private int gear;
    public void setSpeed(int speed){
   this.speed=speed;
        System.out.println(" Speed := "+this.speed);
    }

    public void setGear(int gear){
  this.gear=gear;
        System.out.println(" Gear := "+this.gear);
    }
    public void ride(){System.out.println("Wshhhh!");    }

}

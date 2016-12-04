package com.tretiakovdim.app.homework.lesson17;

/**
 * Created by DmitryTretiakov on 26.11.2016.
 */
public enum  Holidays {
    NEW_YEAR(1,"January","New year"), INDEPENDENCE_DAY(24, "August","Independence Day");
private int day;
    private String month;
    private String fullName;
    private Holidays(int day, String month,String fullName) {
        this.fullName = fullName;
        this.day = day;
        this.month = month;
    }

    int getDay(){return day;}

}

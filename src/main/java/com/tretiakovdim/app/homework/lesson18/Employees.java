package com.tretiakovdim.app.homework.lesson18;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class Employees extends UniversityPerson {
    private String function;

    public Employees() {
        super();
        this.function = "";
    }


    public Employees(String surname, String name, String faculty, String university, String function) {
        super(surname, name, faculty, university);
        this.function = function;
    }

    @Override
    public String getCart() {

        return super.getCart() + "      | " + function + "      | ";
    }

    @Override
    public boolean infoCheck(Integer key, String value) {
        switch (key) {
            case 1:
                return super.infoCheck(key, value);
            case 2:
                return super.infoCheck(key, value);
            case 3:
                return super.infoCheck(key, value);
            case 4:
                return this.function.toLowerCase().contains(value.trim().toLowerCase());
        }

        return false;
    }


}


package com.tretiakovdim.app.homework.lesson18;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class Students extends UniversityPerson {
    private     String status;
    private   String yearOfStudy;

    public Students() {
        super();
        status = "";
        this.yearOfStudy = "";
    }


    public Students(String surname, String name, String faculty, String status, String yearOfStudy, String university) {
        super(surname, name, faculty, university);
        this.status = status;
        this.yearOfStudy = yearOfStudy;


    }
    @Override
    public String getCart(){

        return super.getCart()+" | "+ status+" | "+yearOfStudy+" | ";
    }
}

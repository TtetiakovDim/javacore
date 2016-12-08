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


    public Students(String surname, String name, String faculty,String university,String status,String yearOfStudy) {
        super(surname, name, faculty, university);
        this.status = status;
        this.yearOfStudy = yearOfStudy;


    }
    @Override
    public String getCart(){

        return super.getCart()+"        |    "+ status+"    |  "+yearOfStudy+" | ";
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
                return this.status.toLowerCase().contains(value.trim().toLowerCase());
            case 5:
                return this.yearOfStudy.toLowerCase().contains(value.trim().toLowerCase());
        }

        return false;
    }

}

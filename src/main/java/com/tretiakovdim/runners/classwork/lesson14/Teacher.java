package com.tretiakovdim.runners.classwork.lesson14;

/**
 * Created by DmitryTretiakov on 19.11.2016.
 */

public class Teacher extends Person {
    private String university;
    private String response;

//    public Teacher(String name, String university) {
//        super(name);
//        this.university = university;
//    }

    public Teacher() {
        super("dd");
    }

    public void printOnTable() {
        System.out.println("Assume this is table)):" + response);
    }

    public void lessonFinished() {
        System.out.println("Do not forget to make homeworc");
    }
}
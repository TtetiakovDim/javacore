package com.tretiakovdim.app.homework.lesson18;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class CardIndexGenerics<T extends UniversityPerson> {
    private T val;

    //    private T[] t;
    public CardIndexGenerics(T[] t) {

//        this.t = t;

    }

    public CardIndexGenerics(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }

}

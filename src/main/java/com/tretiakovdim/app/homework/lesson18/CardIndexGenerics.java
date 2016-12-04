package com.tretiakovdim.app.homework.lesson18;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class CardIndexGenerics<T extends UniversityPerson> {

    private T[] t;
    public CardIndexGenerics(T[] t) {

        this.t = t;

    }
}

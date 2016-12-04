package com.tretiakovdim.runners.classwork.lesson17;

/**
 * Created by DmitryTretiakov on 30.11.2016.
 */
public class BoxPrinterGenerics<T> {

    private T val;
    // T stands for "Type" – this is placeholder
    public BoxPrinterGenerics(T arg) { val = arg; }
    public String toString() {
        return "{" + val + "}";
    }
    public T getValue() { return val; }
}

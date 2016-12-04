package com.tretiakovdim.runners.classwork.lesson17;

/**
 * Created by DmitryTretiakov on 30.11.2016.
 */
public class TestBoxPrinter {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);

        // Here is runtime error of class casting assignment
//        Integer intValue2 = (Integer) value2.getValue();

        BoxPrinterGenerics<Integer> value11 =
                new BoxPrinterGenerics<Integer>(new Integer(10));
        System.out.println(value11);
        Integer intValue11 = value11.getValue();
        BoxPrinterGenerics<String> value22 =
                new BoxPrinterGenerics<String>("Hello world");
        System.out.println(value22);
        // Here is the same error, but now it is compile-time error
//        Integer intValue22 = value22.getValue();
        String intValue22 = value22.getValue();


    }
}

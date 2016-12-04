package com.tretiakovdim.app.homework.lesson15;

/**
 * Created by DmitryTretiakov on 22.11.2016.
 */


interface Interface1 {
    int someField = 100;
    String someMethod();
}
interface Interface2 {
    int someField = 200;
    String someMethod();
}
class SomeClass implements Interface1, Interface2 {
    public String someMethod() {
        return "It Works";
    }
}
public class InterfaceXp {
    public static void main(String[] args) {
        SomeClass a = new SomeClass();
        System.out.println( a.someMethod() ); // It works
//        System.out.println( a.someField ); // ошибка
        System.out.println( ( (Interface1) a).someField ); // 100
        System.out.println( Interface1.someField ); // 100
    }
}
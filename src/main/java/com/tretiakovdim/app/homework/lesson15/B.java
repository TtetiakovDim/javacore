package com.tretiakovdim.app.homework.lesson15;

/**
 * Created by DmitryTretiakov on 22.11.2016.
 */

abstract class A {
    int p1;

    A() {
        p1 = 1;
    }

    void print() {
        System.out.println(p1);
    }
}

class B extends A {
    public static void main(String[] args) {
        A ob1;
        
        // ошибка: ob1 = new A();
        B ob2 = new B(); // будет вызван конструктов по умолчанию из A
        ob2.print();
    }
}
package com.tretiakovdim.app.homework.lesson14;

/**
 * Created by DmitryTretiakov on 18.11.2016.
 * 1.Написать класс Human который имеет только один параметризированный конструктор, принимающий на входе возраст и имя человека.
 * Поля возраст и имя должны быть приватными, а в классе должны быть реализованы геттеры getName(), getAge() и сеттер setAge (int age)
 * который проверяет что возраст человека находится в диапазоне 1..120 лет, и в зависимости от этого выводит сообщение “New age setted” и
 * сохраняет значение в поле возраста, или выводит сообщение “Age invalid” (если возраст не входит в диапазон).
 * <p>
 * 2.Реализовать класс WhiteCollar, который наследует Human и в конструкторе принимает значения возраста, имени и компании,
 * при этом вызывая родительский конструктор для сохранения в приватные поля имени и возраста.
 * Реализовать сеттер setCompany (String string), который сохраняет в поле companyName введенное значение, если оно состоит только
 * из латинских символов, тире, пробела и/или запятых. В противном случае выводится сообщение “Company name is invalid”.
 */
public class Human {
    private int age;
    private String name;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Human() {
        this.age = 21;
        this.name = "Vasia";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 120 && age > 0) {
            this.age = age;
            System.out.println(" New age setted");
        } else System.out.println(" Age invalid");
    }
}

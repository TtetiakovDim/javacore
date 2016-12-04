package com.tretiakovdim.app.homework.lesson18;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 * ** Реализовать картотеку университета, в которой хранятся сотрудники следующих типов (должностей): профессор, лаборант, заведующий кафедры,
 * и студенты следующих типов: студенты, бакалавры, специалисты и магистры. Данные по картотеке хранятся в файле csv, из которого загружаются при запуске программы.
 * Должны быть доступны следующие возможности:
 * Выполнять поиск по имени или фамилии по всем записям (наличие введенных данных проверяются сначала в фамилиях, потом в именах)
 * Выполнять поиск по группам и вывести все записи, в которых есть (точное или частичное совпадение):
 * для сотрудников должен быть доступен факультет, и при выборе категории сотрудников поиск должен быть доступен также по факультету
 * (наличие введенных данных проверяются сначала в фамилиях, потом в именах, потом в именах факультетов)
 * Для студентов должен быть доступен поиск по факультету и по курсу (наличие введенных данных проверяются сначала в фамилиях, потом в именах, потом в именах факультетов и
 * потом в номерах курсов)
 * В записях категорий сотрудников должны быть доступны и выведены в результаты поиска
 * имя
 * фамилия
 * факультет
 * должность
 * В записях категорий студентов должны быть доступны и выведены в результаты поиска
 * имя
 * фамилия
 * факультет
 * курс
 * статус (студент, бакалавр, специалист, магистр)
 */
public class UniversityPerson {
    private String surname;
    private String name;
    private String faculty;
    private String university;

    public String getCart() {

        return " | "+surname+"      | "+name+"      | "+faculty;
    }


    public UniversityPerson(String surname, String name, String faculty, String university) {
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.university = university;
    }

    public UniversityPerson() {
        this.surname = "";
        this.name = "";
        this.faculty = "";
        this.university = "";
    }
public boolean infoCheck(Integer key,String value){
    switch (key) {
        case 1:
            return this.surname.toLowerCase().contains(value.trim().toLowerCase());
        case 2:
            return this.name.toLowerCase().contains(value.trim().toLowerCase());
        case 3:
            return this.faculty.toLowerCase().contains(value.trim().toLowerCase());
    }
    return false;
}
//    public boolean infoSearchString(Integer key,String value){
////        Pattern pattern = Pattern.compile(":|;");
////        String[] strings = pattern.split(this.getCart());
////        Arrays.asList(strings).forEach(animal -> System.out.print(animal + " "));
//
//        System.out.println(this.getCart());
//        return this.getCart().toLowerCase().contains(value.trim().toLowerCase());
//    }

}


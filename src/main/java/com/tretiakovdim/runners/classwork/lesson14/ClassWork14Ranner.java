package com.tretiakovdim.runners.classwork.lesson14;

/**
 * Created by DmitryTretiakov on 16.11.2016.
 */
public class ClassWork14Ranner {
    public static void main(String[] args) {
        Student student = new Student("Kid", "Kid");
        student.name = "1";
        System.out.println(student.getName("Dima"));
        student.setUniversity("KPI");
        System.out.println(student.getUniversity());
//Teacher teacher=new Teacher("Ivan","Kit c");
//        System.out.println(teacher.getResponse("What time is now!"));
//
        Person person= new Student("Ivan","Kit c");
        System.out.println(person.getResponse("What class!"));

//        person = new Teacher("Evgeniy","Kit c");
        System.out.println(person.getResponse("What time is now!"));

    }
}

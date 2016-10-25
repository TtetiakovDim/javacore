package com.tretiakovdim.app.homework.lesson7;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Стас on 22.10.2016.
 */
public class LoopsArrayshomework7 {


    public  void LoopsArraysTaskOne(){
int inArrays[]=new  int[10];
        //System.out.println(inArrays.length+" ");
        for(int i=0,j=0;i<inArrays.length;i++){
            inArrays[i] =j+=2;
                                }
        for(int i=0;i<inArrays.length;i++) System.out.print(" "+inArrays[i]);
        System.out.println(" ");
        for(int i=0;i<inArrays.length;i++) System.out.println(" "+inArrays[i]);
    }
    public  void LoopsArraysTaskTwo(){
        int inArrays[]=new  int[50];
        //System.out.println(inArrays.length+" ");
        for(int i=0,j=-1;i<inArrays.length;i++){
            inArrays[i] =j+=2;
            System.out.print(" "+inArrays[i]);
        }
        System.out.println(" ");
        for(int i=49;i>0;i--) System.out.print(" "+inArrays[i]);
        System.out.println(" ");

    }
    public  void LoopsArraysTaskTree(){
        int inArrays[]=new  int[15];

        for(int i=0;i<inArrays.length;i++){
            inArrays[i] = (int) (Math.random() * 9);
            System.out.print(" "+inArrays[i]);
        }
        System.out.println(" ");
        for(int i=0;i<inArrays.length;i++){
            if(inArrays[i]%2==0) System.out.println("Четное число : "+inArrays[i]);

        }
        }
    public  void LoopsArraysTaskFour(){

        int inArrays[]=new  int[15];
int max=0,min =999;
        for(int i=0;i<inArrays.length;i++){
            inArrays[i] = (int) (Math.random() * 999);
            System.out.print(" "+inArrays[i]);
        }
        System.out.println(" ");

        for(int i=0;i<inArrays.length;i++){
            if(inArrays[i]>max) max=inArrays[i];
            if(inArrays[i]<min) min=inArrays[i];

        }
        System.out.println(" Max число : "+max);
        System.out.println(" Min число : "+min);



    }
    public  void LoopsArraysTaskFife(){

    }

    public  void LoopsArraysTaskSix() throws IOException {
        //Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
        int inArrays[][]=new  int[8][5];

        //System.out.print(" "+ Arrays.deepToString(inArrays));

        for(int i=0;i<inArrays.length;i++){
            for(int j=0;j<inArrays[i].length;j++){
            inArrays[i][j] = (int) (Math.random() * 89+10);


                //System.out.print(" i="+i+" j="+j+ " "+inArrays[i][j]);

            }
        }
        System.out.print(" "+ Arrays.deepToString(inArrays));
        //Runtime.getRuntime().exec("cls");

    }
    public  void LoopsArraysTaskSeven(){
        int inArrays[][]=new  int[8][5];

        //System.out.print(" "+ Arrays.deepToString(inArrays));

        for(int i=0;i<inArrays.length;i++){
            for(int j=0;j<inArrays[i].length;j++){
                inArrays[i][j] = (int) (Math.random() * 999+1);


                //System.out.print(" i="+i+" j="+j+ " "+inArrays[i][j]);

            }
        }
        System.out.print(" "+ Arrays.deepToString(inArrays));


    }
    public  void LoopsArraysTaskEight(){
        int inArrays[]=new  int[5];
        int summ=0,min =999;
        System.out.println(" Введите чисела : ");
        Scanner scanner = new Scanner(System.in);
        String line = null;
        for(int i=0;i<inArrays.length;i++){


            //if (scanner.equals("exit")) break;
                 System.out.print("Введите число "+i+" ");
            if (scanner.equals("enter")) break;
             inArrays[i] =scanner.nextInt();
            //inArrays[i] =  scanner.nextInt();


        }
        System.out.println(" ");

        for(int i=0;i<inArrays.length;i++){
            summ=inArrays[i]+summ;

        }
        System.out.println(" Сумма чисел : "+summ);

    }
}


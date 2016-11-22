package com.tretiakovdim.app.homework.lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DmitryTretiakov on 18.11.2016.
 */
public class WhiteCollar extends Human {
public    String companyName;

    public WhiteCollar(int age, String name, String company) {
        super(name, age);
        this.companyName = company;
    }

    public void setCompany(String string) {
        if(testCompanyName(string)) {
            companyName = string;
        }else  System.out.println("Company name is invalid");

    }

    public static boolean testCompanyNameParrern(String message) {
        Pattern p = Pattern.compile("^[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ]+");
        Matcher m = p.matcher(message);
        return m.matches();
    }
    public static boolean testCompanyName(String companyName){
        char[] symbols = companyName.toCharArray();
        if(symbols.length >0&&symbols[0]==' '){  return false;}
        String validationString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_ , ";
        for(char c : symbols){
//            System.out.print(" symbols "+symbols);
            if(validationString.indexOf(c)==-1) return false;
        }
        return true;
    }

}

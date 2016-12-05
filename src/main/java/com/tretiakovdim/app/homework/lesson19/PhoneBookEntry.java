package com.tretiakovdim.app.homework.lesson19;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by DmitryTretiakov on 05.12.2016.
 */
public class PhoneBookEntry {
    private String name;
    private String phoneNumber;

    @Override
    public String toString() {
        return this.name + " " + this.phoneNumber;
    }

    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBookEntry() {
        this.name = "";
        this.phoneNumber = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean checkNameOrPhoneNumber(Integer key, String value) {
        switch (key) {
            case 1:
                return this.name.toLowerCase().contains(value.trim().toLowerCase());
            case 2:
                return this.phoneNumber.toLowerCase().contains(value.trim().toLowerCase());

        }
        return false;

    }
}

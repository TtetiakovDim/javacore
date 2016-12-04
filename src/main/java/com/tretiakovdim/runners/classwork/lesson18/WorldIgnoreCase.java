package com.tretiakovdim.runners.classwork.lesson18;

import java.util.Objects;

/**
 * Created by DmitryTretiakov on 03.12.2016.
 */
public class WorldIgnoreCase extends Object {
    String string;

    public WorldIgnoreCase(String word) {
        this.string = word;

    }

    @Override
    public boolean equals(Object string) {
        if (this.string.equalsIgnoreCase(string.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(string.toLowerCase());
    }

    @Override

    public String toString() {

        return string;

    }
}


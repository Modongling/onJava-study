package com.dave.java.newfeature;

import java.util.ArrayList;

public class GenericTypeInference {
    void old() {
        ArrayList<Apple> apples = new ArrayList<>();
    }

    void modern() {
        var apples = new ArrayList<Apple>();
    }

    void pitFall() {
        //Object类型
        var apples = new ArrayList<>();
        apples.add(new Apple());
        apples.get(0);

    }
}

class Apple {
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

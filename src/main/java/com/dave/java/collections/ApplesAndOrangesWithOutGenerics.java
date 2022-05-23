package com.dave.java.collections;

import java.util.ArrayList;

/**
 * 无泛型限制
 */
public class ApplesAndOrangesWithOutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for(Object apple : apples) {
            ((Apple)apple).getId();
        }
    }
}
class Apple {
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

class Orange {}
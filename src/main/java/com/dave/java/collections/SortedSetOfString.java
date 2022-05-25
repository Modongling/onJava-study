package com.dave.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetOfString {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Yellow");
            set.add("Blue");
            set.add("Red");
            set.add("Orange");
            set.add("Yellow");
            set.add("Blue");
            set.add("Purple");
        }
        System.out.println(set);
    }
}

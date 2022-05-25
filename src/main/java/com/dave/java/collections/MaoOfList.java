package com.dave.java.collections;

import com.dave.java.reflection.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaoOfList {
    public static final Map<Person, List<? extends Pet>> map = new HashMap<>();
    static {
        map.put(new Person("Dawn"), Arrays.asList(
                new Cymric("Molly"),
                new Mutt("Spot")
        ));
        map.put(new Person("Kate"), Arrays.asList(
                new Cat("Shackleton"),
                new Cat("Elise, May"),
                new Dog("Margrett")
        ));
        map.put(new Person("Marilyn"), Arrays.asList(
                new Pug("Louie aka Louis Snorkelstein Dupree"),
                new Cat("Stanford"),
                new Cat("Pinkola")
        ));
        map.put(new Person("Luke"), Arrays.asList(
                new Rat("Fuzzy"),
                new Rat("Fizzy")
        ));
        map.put(new Person("Isaac"), Arrays.asList(
                new Rat("Freckly")
        ));
    }

    public static void main(String[] args) {
        System.out.println("People:" + map.keySet());
        System.out.println("Pets:" + map.values());
        for (Person p : map.keySet()) {
            System.out.println(p + " has ");
            for (Pet pet : map.get(p)) {
                System.out.println("  " + pet);
            }
        }
    }
}

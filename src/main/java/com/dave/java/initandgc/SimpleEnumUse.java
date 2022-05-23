package com.dave.java.initandgc;

public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
        for (Spiciness spiciness : Spiciness.values()) {
            System.out.println(spiciness.ordinal());
        }

        for (var spiciness : Spiciness.values()) {
            System.out.println(spiciness);
        }
    }
}

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

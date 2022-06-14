package com.dave.java.generics;

public class holder1 {
    private Automobile a;

    public holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}

class Automobile {}

package com.dave.java.initandgc;

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana(),
                b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
class Banana {
    void peel(int i) {}
}

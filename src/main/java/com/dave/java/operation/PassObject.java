package com.dave.java.operation;

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("x.c:" + x.c);
        //方法调用别名，以及方法副本传递went
        f(x);
        System.out.println("x.c:" + x.c);
    }
}
class Letter {
    char c;
}

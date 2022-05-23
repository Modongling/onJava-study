package com.dave.java.innerclazz;

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("anonymous init");
            }
            @Override
            public void f() {
                System.out.println("inside f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
abstract class Base {
    Base(int i) {
        System.out.println("Base Constructor: " + i);
    }
    public abstract void f();
}

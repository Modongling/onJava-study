package com.dave.java.interfaces;

/**
 * 多实现，同名重新
 */
public class Jim implements Jim1, Jim2 {
    //
    @Override
    public void f() {
        Jim1.super.f();
    }

    public static void main(String[] args) {
        new Jim().f();
    }
}

interface Jim1 {
    default void f() {
        System.out.println("Jim1:f");
    }
}

interface Jim2 {
    default void f() {
        System.out.println("Jim2:f");
    }
}

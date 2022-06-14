package com.dave.java.generics;

public class GenericMethods {
    /**
     * 泛型参数类型
     * @param x
     * @param <T>
     */
    public <T> void f(T x) {
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        methods.f("");
        methods.f(1);
        methods.f(1.0);
        methods.f(1.0F);
        methods.f('c');
        methods.f(methods);
    }
}

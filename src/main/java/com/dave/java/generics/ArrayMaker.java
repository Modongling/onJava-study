package com.dave.java.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker <T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }
    T[] create(int size) {
        //泛型数组创建
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> arrayMaker = new ArrayMaker<>(String.class);
        String[] s = arrayMaker.create(9);
        System.out.println(Arrays.toString(s));
    }
}

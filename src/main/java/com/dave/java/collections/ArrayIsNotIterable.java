package com.dave.java.collections;

import java.util.Arrays;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> iterable) {
        for (T t : iterable) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        //集合转换为collection
        test(Arrays.asList(strings));
    }
}

package com.dave.java.utils;

import java.util.stream.Stream;

public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Stream.generate(BasicSupplier.create(CountedObject.class))
                .limit(5)
                .forEach(System.out::println);
    }
}

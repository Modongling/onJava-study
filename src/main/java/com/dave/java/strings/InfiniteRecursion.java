package com.dave.java.strings;

import java.util.stream.Stream;

public class InfiniteRecursion {
    @Override
    public String toString() {
        //对象不能转为String
        //return "InfiniteRecursion address: " + this + "\n";
        return super.toString();
    }

    public static void main(String[] args) {
        Stream.generate(InfiniteRecursion::new)
                .limit(10)
                .forEach(System.out::println);
    }
}

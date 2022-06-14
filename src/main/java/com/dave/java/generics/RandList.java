package com.dave.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandList<T> extends ArrayList<T> {
    private Random random = new Random(47);
    public T select() {
        return get(random.nextInt(size()));
    }

    public static void main(String[] args) {
        RandList<String> list = new RandList<>();
        Arrays.asList(("The quick brown fox jumped over " +
                        "the lazy brown dog").split(" "))
                .forEach(list::add);
        IntStream.range(0, 11).forEach(i -> System.out.print(list.select() + " "));
    }
}

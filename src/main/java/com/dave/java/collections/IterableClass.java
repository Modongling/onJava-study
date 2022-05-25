package com.dave.java.collections;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] word = "And that is how we know the Earth to be banana-shaped.".split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < word.length;
            }

            @Override
            public String next() {
                return word[index++];
            }
        };
    }

    public static void main(String[] args) {
        /**
         * for-in本质上也是一个迭代器实现
         */
        for (String s : new IterableClass()) {
            System.out.print(s + " ");
        }
    }
}

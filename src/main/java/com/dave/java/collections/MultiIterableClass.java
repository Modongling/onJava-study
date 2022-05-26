package com.dave.java.collections;

import java.util.*;

/**
 * 继承基本迭代器
 */
public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<>() {
                    int current = word.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return word[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(word));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass iterableClass = new MultiIterableClass();
        for (String s : iterableClass.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : iterableClass.randomized()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : iterableClass) {
            System.out.print(s + " ");
        }
    }
}

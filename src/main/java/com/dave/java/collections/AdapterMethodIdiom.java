package com.dave.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> list = new ReversibleArrayList<>(
                Arrays.asList("To be or not to be".split(" "))
        );
        //父类迭代器
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : list.reversed()) {
            System.out.print(s + " ");
        }
    }
}

/**
 * 适配器模式
 * @param <T>
 */
class ReversibleArrayList<T> extends ArrayList<T> {
    ReversibleArrayList(Collection<T> collection) {
        super(collection);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }
}
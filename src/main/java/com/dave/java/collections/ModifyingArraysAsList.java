package com.dave.java.collections;

import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] is = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(is));
        System.out.println("Before shuffling:" + list);
        //包装list
        Collections.shuffle(list, random);
        System.out.println("After shuffling:" + list);
        System.out.println("array:" + Arrays.asList(is));

        List<Integer> list2 = Arrays.asList(is);
        System.out.println("Before shuffling:" + list2);
        //直接引用原数组
        Collections.shuffle(list2, random);
        System.out.println("After shuffling:" + list2);
        System.out.println("array:" + Arrays.asList(is));

    }
}

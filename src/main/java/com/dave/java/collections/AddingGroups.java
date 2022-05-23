package com.dave.java.collections;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        //构造一个Collection再以这种方式初始化比较快捷
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        //创建定长数组
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);

    }
}

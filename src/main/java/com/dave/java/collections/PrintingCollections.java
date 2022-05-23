package com.dave.java.collections;

import java.util.*;

/**
 * Collection
 *    --- List
 *         --- ArrayList 随机访问
 *         --- LinkedList 插入删除性能
 */
public class PrintingCollections {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        //去重
        System.out.println(fill(new HashSet<>()));
        //排序去重
        System.out.println(fill(new TreeSet<>()));
        //按添加顺序存储
        System.out.println(fill(new LinkedHashSet<>()));
        //映射
        System.out.println(fill(new HashMap<>()));
        //key排序映射
        System.out.println(fill(new TreeMap<>()));
        //添加顺序排序映射
        System.out.println(fill(new LinkedHashMap<>()));

    }
}

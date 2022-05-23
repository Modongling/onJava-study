package com.dave.java.initandgc;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        Random rand = new Random(47);
        //随机数初始化一个20以内的数组
        int[] a = new int[rand.nextInt(20)];
        //直接赋值
        int [] b = {1, 2, 3};
        //自动装箱
        Integer[] c = new Integer[]{4, 5, 6};
        System.out.println(a.length);
        //数组元素为标准类型默认值
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}

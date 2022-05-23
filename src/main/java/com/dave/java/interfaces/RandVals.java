package com.dave.java.interfaces;

import java.util.Random;

/**
 * 接口静态常量展示
 * 实际工作中，常量集的定义应该也定义为接口
 */
public interface RandVals {
    //存储在静态存储区,不和接口本身在一起，在类第一次加载时加载
    Random RANDOM = new Random(47);
    int RAND_INT = RANDOM.nextInt(10);
    long RAND_LONG = RANDOM.nextLong() * 10;
    float RAND_FLOAT = RANDOM.nextFloat() * 10;
    double RAND_DOUBLE = RANDOM.nextDouble() + 10;

    static void main(String[] args) {
        System.out.println(RandVals.RAND_INT);
        System.out.println(RandVals.RAND_LONG);
        System.out.println(RandVals.RAND_FLOAT);
        System.out.println(RandVals.RAND_DOUBLE);
    }
}

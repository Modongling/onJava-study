package com.dave.java.operation;

import java.util.Random;

public class MathOps {
    public static void main(String[] args) {
        //指定随机数初始值种子，保证后续的随机数序列相同
        Random rand = new Random(47);
        int i, j, k;
        //1 - 100随机数
        j = rand.nextInt(100) + 1;
        System.out.println("j:" + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k:" + k);
        i = j + k;
        System.out.println("j + k:" + i);
        i = j - k;
        System.out.println("j - k:" + i);
        i = j * k;
        System.out.println("j * k:" + i);
        i = j / k;
        System.out.println("j / k:" + i);
        i = j % k;
        System.out.println("j % k:" + i);
        j %= k;
        System.out.println("j %= k" + j);
        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v:" + v);
        w = rand.nextFloat();
        System.out.println("w:" + w);
        u = v + w;
        System.out.println("v + w:" + u);
        u = v - w;
        System.out.println("v - w:" + u);
        u = v * w;
        System.out.println("v * w:" + u);
        u = v / w;
        System.out.println("v / w:" + u);
        u += v;
        System.out.println("u += v:" + u);
        u -= v;
        System.out.println("u -= v:" + u);
        u *= v;
        System.out.println("u *= v:" + u);
        u /= v;
        System.out.println("u /= v:" + u);
    }
}

package com.dave.java.reuse;

import java.util.Arrays;
import java.util.Random;

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    //编译时常量
    private final int valueOne = 9;
    //唯一的常量
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    //非编译时常量
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    //表示引用地址不可变
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //数组引用地址不变
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4
                + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //对象地址不变，但是成员变量是可变的
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            //数组和上面类似
            fd1.a[i]++;
        }
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
        System.out.println(Arrays.toString(fd1.a));
        System.out.println(fd1.v2);
    }
}

class Value {
    int i;

    Value(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Value{" +
                "i=" + i +
                '}';
    }
}

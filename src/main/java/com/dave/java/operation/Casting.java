package com.dave.java.operation;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        //自动提升，小类型转大类型
        long lng = i;
        long lng2 = 200L;
        //大类型转小类型，强制类型转换，会损失精度
        i = (int) lng2;
    }
}

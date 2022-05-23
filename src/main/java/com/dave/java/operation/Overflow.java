package com.dave.java.operation;

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big:" + big);
        //上溢，在超过最大值时不,而是重最小值开始循环向上升，形成一个loop(下溢类似)
        int bigger = big * 4;
        System.out.println("bigger:" + bigger);
    }
}

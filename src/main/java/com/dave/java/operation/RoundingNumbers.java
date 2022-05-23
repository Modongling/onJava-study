package com.dave.java.operation;

/**
 * 类型提升规则:【内置内存大小固定,所以没有sizeof】<br/>
 * 1.char/byte/short ---> int<br/>
 * 2.float ---> double<br/>
 * 3.int ---> long<br/>
 * 4.boolean true/false
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7F, fbelow = 0.4F;
        System.out.println("Math.round(above):" + Math.round(above));
        System.out.println("Math.round(below):" + Math.round(below));
        System.out.println("Math.round(fabove):" + Math.round(fabove));
        System.out.println("Math.round(fbelow):" + Math.round(fbelow));
    }
}

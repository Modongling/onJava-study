package com.dave.java.operation;

public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElse(int i) {
        //java中的逻辑条件一定是boolean类型
        if (i < 10) {
            return i * 100;
        } else {
            return 1 * 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(10);
    }
}

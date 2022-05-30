package com.dave.java.strings;

/**
 * 实际转译结果和书上的说明不一致
 * 了解到单线程字符串拼接编译器可能会通过StringBuilder做优化
 */
public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }
}

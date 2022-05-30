package com.dave.java.strings;

/**
 * final Sting 线程安全，节约资源
 */
public class Immutable {
    public static String upCase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);
        //qq为一个新的字符串引用
        //调用方法时,s为对象q的一个copy，形成一个局部变量
        String qq = upCase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}

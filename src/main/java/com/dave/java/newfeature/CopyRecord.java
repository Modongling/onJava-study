package com.dave.java.newfeature;

public class CopyRecord {
    public static void main(String[] args) {
        var r1 = new R(11, 2.2, 'z');
        var r2 = new R(r1.a(), r1.b(), r1.c());
        //同一个对象
        System.out.println(r1.equals(r2));
    }
}

record R(int a, double b, char c) {}

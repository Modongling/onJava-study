package com.dave.java.initandgc;

/**
 * 可变参数方法应该避免同名歧义
 * 如果一定需要重名则至少需要一个非可变参数区分
 */
public class VarargType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }
    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + int[].class);
    }
}

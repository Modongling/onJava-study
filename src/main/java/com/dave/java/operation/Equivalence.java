package com.dave.java.operation;

public class Equivalence {
    static void show(String desc, Integer n1, Integer n2) {
        System.out.println(desc + ":");
        System.out.printf("%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }
    @SuppressWarnings("deprecation")
    public static void test(int value) {
        //默认调用Integer.valueOf()
        Integer i1 = value;
        Integer i2 = value;
        //自动装箱
        show("Automatic", i1, i2);
        //9以后被弃用
        Integer r1= new Integer(value);
        Integer r2 = new Integer(value);
        show("new Integer()", r1, r2);
        //效率更高
        //-127~128多次调用会进行数据缓存,因此new Integer()只会创建一个对象
        Integer v1 = Integer.valueOf(value);
        Integer v2 = Integer.valueOf(value);
        show("Integer.valueOf()", v1, v2);
        //基本类型
        int x = value;
        int y = value;
        System.out.println("Primitive int:");
        System.out.printf("%d==%d %b%n", x, y, x == y);
    }

    public static void main(String[] args) {
        test(127);
        test(128);
    }
}

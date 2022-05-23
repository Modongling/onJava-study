package com.dave.java.operation;

public class DoubleEquivalence {
    static void show(String desc, Double n1, Double n2) {
        System.out.println(desc + ":");
        System.out.printf("%e==%e %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }
    @SuppressWarnings("deprecation")
    public static void test(double x1, double x2) {
        //默认调用Double.valueOf()
        Double i1 = x1;
        Double i2 = x2;
        //自动装箱
        show("Automatic", i1, i2);
        //9以后被弃用
        Double r1= new Double(x1);
        Double r2 = new Double(x2);
        show("new Double()", r1, r2);
        //效率更高
        //-127~128多次调用会进行数据缓存,因此new Double()只会创建一个对象
        Double v1 = Double.valueOf(x1);
        Double v2 = Double.valueOf(x2);
        show("Double.valueOf()", v1, v2);
        //基本类型
        double x = x1;
        double y = x2;
        System.out.println("Primitive double:");
        System.out.printf("%e==%e %b%n", x, y, x == y);
    }

    public static void main(String[] args) {
        test(0, Double.MIN_VALUE);
        //浮点数较大值运算时会发生舍人误差
        test(Double.MAX_VALUE, Double.MAX_VALUE - Double.MIN_VALUE * 1_000_000);
    }
}

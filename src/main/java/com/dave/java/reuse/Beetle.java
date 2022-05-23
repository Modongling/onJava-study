package com.dave.java.reuse;

/**
 * 初始化顺序:
 * 父类静态成员
 * 子类静态成员
 * 父类成员变量
 * 父类构造器
 * 子类成员变量
 * 子类构造器
 */
public class Beetle extends Insect {
    private int k = printInt("static method in sub obj var");
    public Beetle() {
        System.out.println(k);
        System.out.println(j);
    }
    private static int x2 = printInt("static method in sub static var");

    public static void main(String[] args) {
        Beetle beetle = new Beetle();
    }
}

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + " j = " + j);
        j = 39;
    }
    private static int x1 = printInt("static method");

    static int printInt(String staticMethod) {
        System.out.println(staticMethod);
        return 47;
    }
}

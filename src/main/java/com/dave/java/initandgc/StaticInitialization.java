package com.dave.java.initandgc;

/**
 * 优先底层初始化静态成员变量【递归】 - 底层构造函数
 * 成员变量 构造函数，成员方法
 */
public class StaticInitialization {
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
    public static void main(String[] args) {
        new Cupboard();
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
}
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        System.out.println("fi(" + marker + ")");
    }
}

class Table {
    static Bowl bowl = new Bowl(1);
    static Bowl bowl2 = new Bowl(2);
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    static Bowl bowl5 = new Bowl(5);
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
}

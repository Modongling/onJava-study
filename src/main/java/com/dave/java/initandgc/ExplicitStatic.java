package com.dave.java.initandgc;

public class ExplicitStatic {
    /**
     * 静态初成员和静态初始化块优先初始化
     */
    static Cups cups = new Cups();
    public static void main(String[] args) {
        Cups.cup1.f(99);
    }
}
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    //静态初始化块
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}
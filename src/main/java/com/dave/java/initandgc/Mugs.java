package com.dave.java.initandgc;

/**
 * 成员变量 --- 构造函数初始化
 */
public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("Member variable block initial");
    }
    Mugs() {
        System.out.println("Mugs()");
    }
    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        new Mugs();
    }
}
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}

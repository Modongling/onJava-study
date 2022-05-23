package com.dave.java.reuse;

/**
 * 总结：
 * 定义为final或者static final的成员必须进行初始化
 * 构造器延迟初始化
 * 如果没有进行初始化编译器就会报错
 */
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }
    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

class Poppet {
    private int i;
    Poppet(int ii) { i = ii; }
}

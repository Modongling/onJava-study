package com.dave.java.polymorphism;

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        //初始化父类构造器后调用子类实现的方法
        //这种情况发生在子类构造器还没有被调用的时候
        draw();
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int radius) {
        this.radius = radius;;
        System.out.println("RoundGlyph():" + radius);
    }

    @Override
    void draw() {
        //先分配存储空间，并初始化为0
        System.out.println("RoundGlyph.draw():" + radius);
    }
}

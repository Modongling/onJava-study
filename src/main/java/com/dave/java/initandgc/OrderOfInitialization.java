package com.dave.java.initandgc;

public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}
class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

/**
 * 优先初始化成员变量，在初始化构造函数
 * 最后是成员方法调用
 */
class House {
    Window window = new Window(1);
    Window window2 = new Window(2);
    Window window3 = new Window(3);
    House() {
        System.out.println("House()");
        window3 = new Window(33);
    }
    void f() {
        System.out.println("f()");
    }
}

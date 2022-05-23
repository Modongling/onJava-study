package com.dave.java.initandgc;

/**
 * this && static 使用总结:<br/>
 * 1.this可用做对象引用<br/>
 * 2.this用作对象传递<br/>
 * 3.仅能在非静态方法中使用<br/>
 * 4.可以屏蔽局部变量和成员变量同名的问题<br/>
 * 5.可以在构造器中调用其他构造器，这个时候this调用语句必须放在第一行，一个构造器只能调用其他构造器一次<br/>
 * ---------------------------------------------------------------------------------------<br/>
 * static代表类成员，不能在静态方法中直接调用非静态方法，需要先实例化类成员【非静态方法中可以调用静态方法】<br/>
 * 需要记住的原则是:所有静态成员属于类，对所有类成员共享
 */
public class Flower {
    int petalCount = 0;
    String s = "inital value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount=" + petalCount);
    }

    Flower(String s) {
        System.out.println("Constructor w/ int arg only, s=" + s);
    }

    Flower(String s, int petalCount) {
        this(petalCount);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("Zero-argument constructor");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

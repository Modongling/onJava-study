package com.dave.java.initandgc;

public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        //载非静态方法调用对象本身，即一个对象的引用
        //在同一个类中调用其他非静态方法
        return this;
    }

    void print() {
        System.out.println("i= " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}

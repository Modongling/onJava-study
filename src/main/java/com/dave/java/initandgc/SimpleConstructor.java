package com.dave.java.initandgc;

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
class Rock {
    /**
     * 无参构造函数，在没有显示指定构造器的时候无参构造器会作为默认的构造器
     * 与类同名，没有返回值
     */
    Rock() {
        System.out.println("Rock ");
    }
}

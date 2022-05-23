package com.dave.java.initandgc;

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}
class Rock2 {
    /**
     * 自定义有参构造函数
     * 当指定有参构造器后，如果需要使用无参构造器需要显式添加
     * @param i
     */
    Rock2(int i) {
        System.out.println("Rock " + i + " ");
    }
}
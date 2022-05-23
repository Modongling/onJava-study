package com.dave.java.interfaces;

/**
 * 9以后允许static和default方法为私有
 * 一个类可以实现多个接口
 */
public interface PureInterface {
    //默认为静态常量 static final
    int i = 1;
    //方法默认为public
    int m1();
    void m2();

    /**
     * 1.增加接口扩展，又不会影响现有已经实现的接口的使用
     */
    default void newMethod() {
        System.out.println("default method");
    }
}

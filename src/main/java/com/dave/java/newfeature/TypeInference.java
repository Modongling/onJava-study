package com.dave.java.newfeature;

/**
 * 类型推断使用准则:
 * 1.不能子啊字段上使用var【成员变量】
 * 2.不可以对没有定义初始值或者赋值为null的局部变量使用
 * 3.不可以指代方法返回值
 */
public class TypeInference {
    void method() {
        String hello1 = "hello";
        var hello = "hello";
        Plumbus plumbus1 = new Plumbus();
        var plumbus2 = new Plumbus();
    }

    static void staticMethod() {
        var hello = "Hello";
        var plumbus2 = new Plumbus();
    }
}

class Plumbus {}

class NoInference {
    String field1 = "Field initialization";
    //var field2 = "aaa";
    void method() {
        //var a = null;
        //var b;
    }
}

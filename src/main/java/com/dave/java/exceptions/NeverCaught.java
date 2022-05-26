package com.dave.java.exceptions;

/**
 * 异常描述和分类
 * Throwable
 *   Error -- 编译时异常
 *   Exception -- 运行时异常，调用时发生
 *   RuntimeException -- 非检查异常，不需要捕获，运行时会直接抛出异常栈
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}

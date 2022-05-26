package com.dave.java.exceptions;

/**
 * 链式throw
 */
public class Rethrowing {
    public static void f() throws Exception{
        System.out.println("Throwing exception f()");
        throw new Exception("f()");
    }

    public static void g() throws Exception{
        try {
            f();
        } catch (Exception e) {
            System.out.println("g() catch");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("h() catch");
            e.printStackTrace(System.out);
            //返回Throwable对象
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main() catch");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main catch()");
            e.printStackTrace(System.out);
        }
    }
}

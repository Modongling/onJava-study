package com.dave.java.exceptions;

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            //打印异常栈到标准输出
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}

class MyException extends Exception {
    MyException() {
    }
    MyException(String msg) {
        super(msg);
    }
}

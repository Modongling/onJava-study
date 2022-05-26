package com.dave.java.exceptions;

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("Throwing f()");
        throw new OneException("f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Inner catch");
                e.printStackTrace(System.out);
                //抛出新异常
                throw new TwoException("from inner");
            }
        } catch (TwoException e) {
            System.out.println("outer catch");
            e.printStackTrace(System.out);
        }
    }
}
class OneException extends Exception {
    OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    TwoException(String s) {
        super(s);
    }
}

package com.dave.java.newfeature;

/**
 * 接口中的私有方法（9+）
 */
public class PrivateInterfaceMethods {
    public static void main(String[] args) {
        new OldImpl().f();
        OldInterface.g();
        new NewImpl().f();
        NewInterface.g();
    }
}

interface NewInterface {
    private void fd() {
        System.out.println("private fd()");
    }
    private static void fs() {
        System.out.println("private static fs()");
    }
    default void f() {
        fd();
    }

    static void g() {
        fs();
    }
}

interface OldInterface {
    default void fd() {
        System.out.println("private fd()");
    }
    static void fs() {
        System.out.println("private static fs()");
    }
    default void f() {
        fd();
    }

    static void g() {
        fs();
    }
}
class NewImpl implements NewInterface {}
class OldImpl implements OldInterface {}
package com.dave.java.exceptions;

/**
 * 终止模型
 * 恢复模型
 * 编译期的异常 -- checked exception
 */
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f().");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions exceptions = new InheritingExceptions();
        try {
            exceptions.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
class SimpleException extends Exception {

}
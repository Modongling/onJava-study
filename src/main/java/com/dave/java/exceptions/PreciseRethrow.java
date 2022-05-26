package com.dave.java.exceptions;

public class PreciseRethrow {
    void catcher() throws DerivedException {
        try {
            throw new DerivedException();
        } catch (BaseException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        PreciseRethrow rethrow = new PreciseRethrow();
        try {
            rethrow.catcher();
        } catch (DerivedException e) {
            e.printStackTrace(System.out);
        }
    }
}
class BaseException extends Exception {
}
class DerivedException extends BaseException {}

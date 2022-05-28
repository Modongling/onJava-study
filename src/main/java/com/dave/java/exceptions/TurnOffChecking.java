package com.dave.java.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckException exception = new WrapCheckException();
        exception.throwRuntimeException(3);
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3) {
                    exception.throwRuntimeException(i);
                } else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
                System.out.println("SomeOtherException:" + e);
            } catch (RuntimeException e) {
                try {
                    throw e.getCause();
                } catch (FileNotFoundException fe) {
                    System.out.println("FileNotFoundException" + fe);
                } catch (IOException ie) {
                    System.out.println("IOException:" + ie);
                } catch (Throwable te) {
                    System.out.println("Throwable:" + te);
                }
            }
        }
    }
}
class SomeOtherException extends Exception {}
class WrapCheckException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0 : throw new FileNotFoundException();
                case 1 : throw new IOException();
                case 2 : throw new RuntimeException("Where I am");
                default: return;
            }
        } catch (IOException | RuntimeException e) {
            //check ---> uncheck
            // main throws 也是一种方式，实际生产不会使用
            throw new RuntimeException(e);
        }
    }
}
package com.dave.java.exceptions;

/**
 * 创建一个需要清理的对象，直接跟一个try-finally
 */
public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup cleanup1 = new NeedsCleanup();
        try {

        } finally {
            cleanup1.dispose();
        }

        NeedsCleanup cleanup2 = new NeedsCleanup();
        NeedsCleanup cleanup3 = new NeedsCleanup();
        try {

        } finally {
            cleanup3.dispose();
            cleanup2.dispose();
        }
        try {
            NeedsCleanup2 cleanup21 = new NeedsCleanup2();
            try {
                NeedsCleanup2 cleanup22 = new NeedsCleanup2();
                try {

                } finally {
                    cleanup22.dispose();
                }
            } catch (ConstructorException e) {
                System.out.println(e);
                //构造器1不会失败的情况下清理
            } finally {
                cleanup21.dispose();
            }
        } catch (ConstructorException e) {
            System.out.println(e);
        }
    }
}

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructorException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
    NeedsCleanup2() throws ConstructorException {
    }
}

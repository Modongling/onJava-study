package com.dave.java.exceptions;

public class MultipleReturns {
    public static void f(int i) {
        System.out.println("init that requires cleanup");
        try {
            System.out.println("Point1");
            if (i == 1) {
                return;
            }
            System.out.println("Point2");
            if (i == 2) {
                return;
            }
            System.out.println("Point3");
            if (i == 3) {
                return;
            }
        } finally {
            System.out.println("Cleanup");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            f(i);
        }
    }
}

package com.dave.java.exceptions;

/**
 * 一般情况下finally都会执行
 */
public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block.");
        try {
            System.out.println("Entering second try block.");
            try {
                throw new FourException();
            } finally {
                System.out.println("finally inner");
            }
        } catch (FourException e) {
            System.out.println("Catch outer");
        } finally {
            System.out.println("finally outer");
        }
    }
}

class FourException extends Exception {}

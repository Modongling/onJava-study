package com.dave.java.exceptions;

public class BodyException {
    public static void main(String[] args) {
        try(
                First first = new First();
                Second second = new Second();
        ) {
            System.out.println("In body");
            Third third = new Third();
            //异常后，非资源头资源不会被清理
            new SecondException();
            System.out.println("End");
        } catch (CE e) {
            System.out.println("Catch:" + e);
        }
    }
}
class Third extends Reporter {}

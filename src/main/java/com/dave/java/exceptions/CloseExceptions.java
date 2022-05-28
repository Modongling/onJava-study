package com.dave.java.exceptions;

public class CloseExceptions {
    public static void main(String[] args) {
        try(
                First first = new First();
                Closer closer = new Closer();
                Second second = new Second();
                ) {
            System.out.println("In body");
        } catch (CloseException e) {
            System.out.println("catch:" + e);
        }
    }
}

class CloseException extends Exception {}

class Reporter2 implements AutoCloseable {
    String name = getClass().getSimpleName();
    Reporter2() {
        System.out.println("Report2 creating:" + name);
    }

    @Override
    public void close() throws CloseException {
        System.out.println("Closing " + name);
    }
}

class Closer extends Reporter2 {
    @Override
    public void close() throws CloseException {
        super.close();
        throw new CloseException();
    }
}
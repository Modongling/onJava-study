package com.dave.java.polymorphism;

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };

        for (Composing c : composings) {
            c.dispose();
        }
    }
}
class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter ++;
    Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef() {
        refCount++;
    }
    public void dispose() {
        if (-- refCount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared{" +
                "refCount=" + refCount +
                ", id=" + id +
                '}';
    }
}
class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter ++;
    Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    public void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing{" +
                "shared=" + shared +
                ", id=" + id +
                '}';
    }
}

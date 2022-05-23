package com.dave.java.initandgc;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }
    public void describe() {
        switch (degree) {
            case NOT -> System.out.println("not spicy at all");
            case MILD, MEDIUM -> System.out.println("a little hot");
            default -> System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
/*
 *  switch (degree) {
 *             case NOT: System.out.println("not spicy at all");
 *             break;
 *             case MILD:
 *             case MEDIUM: System.out.println("a little hot");
 *             break;
 *             case HOT:
 *             case FLAMING:
 *             default:
 *                 System.out.println("maybe too hot");
 *         }
 */
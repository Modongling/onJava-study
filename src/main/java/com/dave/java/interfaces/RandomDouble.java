package com.dave.java.interfaces;

import java.util.Random;

public interface RandomDouble {
    Random RANDOM = new Random(47);
    default double next () {
        return RANDOM.nextDouble();
    }

    static void main(String[] args) {
        RandomDouble randomDouble = new RandomDouble() {};
        for (int i = 0; i < 7; i++) {
            System.out.print(randomDouble.next() + " ");
        }
    }
}

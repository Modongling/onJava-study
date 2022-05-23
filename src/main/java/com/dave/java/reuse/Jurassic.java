package com.dave.java.reuse;

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.f();
    }
}

class SmallBrain {}

/**
 * 不能被继承的类
 */
final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain smallBrain = new SmallBrain();
    void f() {}
}

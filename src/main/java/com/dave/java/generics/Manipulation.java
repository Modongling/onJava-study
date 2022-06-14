package com.dave.java.generics;

public class Manipulation {
    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hasF);
        manipulator.manipulate();
    }
}

/**
 * 上界限定，泛型擦除时用HasF代替
 * @param <T>
 */
class Manipulator<T extends HasF> {
    private T obj;
    Manipulator(T x) { obj = x; }
    public void manipulate() { obj.f(); }
}

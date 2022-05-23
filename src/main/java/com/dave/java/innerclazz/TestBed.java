package com.dave.java.innerclazz;

public class TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Test {
        public static void main(String[] args) {
            TestBed bed = new TestBed();
            bed.f();
        }
    }
}

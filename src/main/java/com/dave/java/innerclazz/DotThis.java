package com.dave.java.innerclazz;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer() {
            //Outer.this
            return DotThis.this;
        }
    }

    public Inner inner() {return new Inner();}

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        //构建一个内部类的出院变量
        DotThis.Inner inner = dotThis.inner();
        //由内到外
        inner.outer().f();
    }
}

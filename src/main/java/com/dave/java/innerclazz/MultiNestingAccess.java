package com.dave.java.innerclazz;

public class MultiNestingAccess {
    public static void main(String[] args) {
        MHA mha = new MHA();
        MHA.A a = mha.new A();
        MHA.A.B b = a.new B();
        b.h();
    }
}
class MHA {
    //private方法可以通过内部类访问
    private void f() {}
    class  A {
        private void g() {}
        public class B {
            void h() {
                f();
                g();
            }
        }
    }
}

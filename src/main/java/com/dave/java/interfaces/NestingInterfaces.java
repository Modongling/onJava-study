package com.dave.java.interfaces;

public class NestingInterfaces {
    public class BImpl implements A.B {
        @Override
        public void f() {

        }
    }

    class CImpl implements A.C {
        @Override
        public void f() {

        }
    }

    class EImpl implements A.E {

        @Override
        public void g() {

        }
    }

    class EGImpl implements A.E.G {

        @Override
        public void f() {

        }
    }

    class EImpl2 implements A.E {

        @Override
        public void g() {

        }
        class EGImpl2 implements G {

            @Override
            public void f() {

            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.receiveD(a.getD());

    }
}

class A {
    interface B {
        void f();
    }

    public class BImpl implements B {

        @Override
        public void f() {

        }
    }

    private class BImpl2 implements B {

        @Override
        public void f() {

        }
    }

    public interface C {
        void f();
    }

    class CImpl implements C {

        @Override
        public void f() {

        }
    }

    private class CImpl2 implements C {

        @Override
        public void f() {

        }
    }

    private interface D {
        void f();
    }

    private class DImpl implements D {
        @Override
        public void f() {

        }
    }

    public class DImpl2 implements D {

        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }

    interface E {
        interface G {
            void f();
        }
        interface H {
            void f();
        }
        void g();
    }
}

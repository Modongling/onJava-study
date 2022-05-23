package com.dave.java.reuse;

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 overridingPrivate2 = new OverridingPrivate2();
        overridingPrivate2.f3();
        //overridingPrivate2.f1();
        OverridingPrivate2 overridingPrivate = overridingPrivate2;
        //非父类
        overridingPrivate.f3();
        WithFinals withFinals = overridingPrivate2;
        //父类的public final可以通过向上转型访问，同样不可继承
        withFinals.f2();
    }
}
class WithFinals {
    private void f1() {
        System.out.println("f1()");
    }

    public final void f2() {
        System.out.println("f2()");
    }

    private void f3() {
        System.out.println("f3()");
    }
}

class OverridingPrivate extends WithFinals {
    private void f1() {
        System.out.println("In sub f1()");
    }

    //final不可继承,private默认为final
//    public final void f2() {
//        System.out.println("f2()");
//    }

    private void f3() {
        System.out.println("In sub f3()");
    }
}


class OverridingPrivate2 extends OverridingPrivate {
    private void f1() {
        System.out.println("In sub2 f1()");
    }

    public void f3() {
        System.out.println("In sub2 f3()");
    }
}